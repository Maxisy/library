package pl.javastart.library.model;

public class Library {
    private static int MAX_BOOKS = 1000;
    private static int MAX_MAGAZINES = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber = 0;
    private int magazinesNumber = 0;

    public void addBook(Book book){
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Nie można dodać więcej książek!");
        }
    }

    public void printBooks(){
        if (booksNumber == 0){
            System.out.println("Brak książek!");
        }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazine(Magazine magazine){
        if (magazinesNumber < MAX_MAGAZINES) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Nie można dodać więcej magazynów!");
        }
    }

    public void printMagazines(){
        if (magazinesNumber == 0){
            System.out.println("Brak magazynów!");
        }

        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }
}
