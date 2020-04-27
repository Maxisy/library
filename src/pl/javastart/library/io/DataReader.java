package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Tytuł:");
        String title = scanner.nextLine();
        System.out.println("Autor:");
        String author = scanner.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = scanner.nextLine();
        System.out.println("ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Rok wydania:");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ilość stron:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł:");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = scanner.nextLine();
        System.out.println("Dzień wydania:");
        int releaseDay = getInt();
        System.out.println("Miesiąc wydania:");
        int releaseMonth = getInt();
        System.out.println("Rok wydania:");
        int releaseYear =  getInt();
        System.out.println("Język:");
        String language = scanner.nextLine();
        return new Magazine(title, publisher, releaseDay, releaseMonth, releaseYear, language);
    }

    public int getInt(){
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public void close(){
        scanner.close();
    }
}
