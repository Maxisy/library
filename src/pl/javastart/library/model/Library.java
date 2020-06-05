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
        while (1 < publicationsNumber && found == notFound) {
            if (Book.getIsbn().equals(isbn)) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != notFound) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found);
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
        while (1 < publicationsNumber && found == notFound) {
            if (Magazine.getTitle().equals(title)) {
                if (Magazine.getYear() == year) {
                    if (Magazine.getMonth() == month) {
                        if (Magazine.getDay() == day) {
                            found = i;
                        }
                    }
                }
            } else {
                i++;
            }
        }

        if (found != notFound) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found);
            publicationsNumber--;
            publications[publicationsNumber] = null;
            return true;
        } else {
            return false;
        }
    }
}