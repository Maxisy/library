package pl.javastart.library.model;

import java.io.Serializable;

public class Library implements Serializable {
    private static int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < publicationsNumber; i++) {
            builder.append(publications[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
}