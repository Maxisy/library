package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytuł:");
        String title = scanner.nextLine();
        printer.printLine("Autor:");
        String author = scanner.nextLine();
        printer.printLine("Wydawnictwo:");
        String publisher = scanner.nextLine();
        printer.printLine("ISBN:");
        String isbn = scanner.nextLine();
        printer.printLine("Rok wydania:");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        printer.printLine("Ilość stron:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        printer.printLine("Tytuł:");
        String title = scanner.nextLine();
        printer.printLine("Wydawnictwo:");
        String publisher = scanner.nextLine();
        printer.printLine("Dzień wydania:");
        int releaseDay = getInt();
        printer.printLine("Miesiąc wydania:");
        int releaseMonth = getInt();
        printer.printLine("Rok wydania:");
        int releaseYear =  getInt();
        printer.printLine("Język:");
        String language = scanner.nextLine();
        return new Magazine(title, publisher, releaseDay, releaseMonth, releaseYear, language);
    }


    public String readMagazineToDeleteTitle() {
        printer.printLine("Tytuł:");
        String title = scanner.nextLine();
        return title;
    }

    public int readMagazineToDeleteYear() {
        printer.printLine("Rok wydania:");
        int year = scanner.nextInt();
        scanner.nextLine();
        return year;
    }

    public int readMagazineToDeleteMonth() {
        printer.printLine("Miesiąc wydania:");
        int month = scanner.nextInt();
        scanner.nextLine();
        return month;
    }

    public int readMagazineToDeleteDay() {
        printer.printLine("Dzień wydania:");
        int day = scanner.nextInt();
        scanner.nextLine();
        return day;
    }

    public String readBookToDelete() {
        printer.printLine("ISBN:");
        String isbn = scanner.nextLine();
        return isbn;
    }

    public int getInt(){
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String getString() {
        return scanner.nextLine();
    }

    public void close(){
        scanner.close();
    }
}
