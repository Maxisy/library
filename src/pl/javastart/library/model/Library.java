package pl.javastart.library.model;

public class Library {
    private static int maxBooks = 1000;
    private Book[] books = new Book[maxBooks];
    private int booksNumber = 0;

    public void addBook(Book book){
        if (booksNumber < maxBooks) {
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
}
