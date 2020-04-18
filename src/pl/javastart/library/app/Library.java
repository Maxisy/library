package pl.javastart.library.app;

import pl.javastart.library.model.Book;

import java.util.Scanner;

import pl.javastart.library.io.DataReader;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        Scanner scanner = new Scanner(System.in);
        DataReader dataReader = new DataReader();

        Book[] books = new Book[1000];

        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
    }
}
