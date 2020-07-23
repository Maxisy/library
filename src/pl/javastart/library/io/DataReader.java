package pl.javastart.library.io;

import pl.javastart.library.exception.NoSuchOptionException;
import pl.javastart.library.model.Book;

import pl.javastart.library.model.Library;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;

import java.sql.Struct;
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
        int releaseYear = getInt();
        printer.printLine("Język:");
        String language = scanner.nextLine();
        return new Magazine(title, publisher, releaseDay, releaseMonth, releaseYear, language);
    }

    public LibraryUser createLibraryUser() {
        printer.printLine("Imię:");
        String firstName = scanner.nextLine();
        printer.printLine("Nazwisko:");
        String lastName = scanner.nextLine();
        printer.printLine("PESEL:");
        String pesel = scanner.nextLine();
        return new LibraryUser(firstName, lastName, pesel);
    }

    public String readMagazineToDeleteTitle() {
        printer.printLine("Tytuł:");
        String title = scanner.nextLine();
        return title;
    }

    public int readMagazineToDeleteYear() {
        printer.printLine("Rok wydania:");
        int year = getInt();
        return year;
    }

    public int readMagazineToDeleteMonth() {
        printer.printLine("Miesiąc wydania:");
        int month = getInt();
        return month;
    }

    public int readMagazineToDeleteDay() {
        printer.printLine("Dzień wydania:");
        int day = getInt();
        return day;
    }

    public String readBookToDelete() {
        printer.printLine("ISBN:");
        String isbn = scanner.nextLine();
        return isbn;
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String getString() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }


    public int readBooksSort() {
        boolean looking = true;
        int option = 0;
        while (looking) {
            try {
                printer.printLine("W jaki sposób posortować wyświetlane książki?");
                printer.printLine("1. Po tytule (alfabetycznie)");
                printer.printLine("2. Po autorze (alfabetycznie)");
                printer.printLine("3. Po dacie (od najbliższej)");
                option = getInt();
                if (option < 1 || option > 3) {
                    throw new NoSuchOptionException("Niepoprawna wartość. Spróbuj ponownie.");
                } else {
                    looking = false;
                }
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage());
            }
        }
        return option;
    }

    public int readMagazinesSort() {
        int option = 0;
        boolean looking = true;
        while (looking) {
            printer.printLine("W jaki sposób posortować wyświetlane magazyny?");
            printer.printLine("1. Po tytule (alfabetycznie)");
            printer.printLine("2. Po dacie (od najbliższej)");
            try {
                option = getInt();
                if (option < 1 || option > 2) {
                    throw new NoSuchOptionException("Niepoprawna wartość. Spróbuj ponownie.");
                } else {
                    looking = false;
                }

            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage());
            }
        }
        return option;
    }
}
