package pl.javastart.library.model;

import java.io.Serializable;
import java.util.Arrays;

public class Library implements Serializable {
    private static int INITIAL_CAPACITY = 1;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[INITIAL_CAPACITY];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addPublication(Publication publication) {
        if (publicationsNumber == publications.length) {
            publications = Arrays.copyOf(publications, publications.length * 2);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public boolean removeBook(String isbn) {
        final int notFound = -1;
        int found = notFound;
        int i = 0;
        while (i < publicationsNumber && found == notFound) {
            if (publications[i] instanceof Book && ((Book)publications[i]).getIsbn().equals(isbn)) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != notFound) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found - 1);
            publicationsNumber--;
            publications[publicationsNumber] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMagazine(String title, int year, int month, int day) {
        final int notFound = -1;
        int found = notFound;
        int i = 0;
        while (i < publicationsNumber && found == notFound) {
            if (publications[i] instanceof Magazine && ((Magazine)publications[i]).getTitle().equals(title)) {
                if (((Magazine)publications[i]).getYear() == year) {
                    if (((Magazine)publications[i]).getMonth() == month) {
                        if (((Magazine)publications[i]).getDay() == day) {
                            found = i;
                        }
                    }
                }
            } else {
                i++;
            }
        }

        if (found != notFound) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found - 1);
            publicationsNumber--;
            publications[publicationsNumber] = null;
            return true;
        } else {
            return false;
        }
    }
}
