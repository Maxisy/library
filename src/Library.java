public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.relaseDate = 2010;
        book1.pages = 296;
        book1.publisher = "Greg";
        book1.isbn = "9788373271890";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.print(book1.title + ", ");
        System.out.print("Autor: " + book1.author + ", ");
        System.out.print("Data wydania: " + book1.relaseDate + ", ");
        System.out.print("Ilość stron: " + book1.pages + ", ");
        System.out.print("Wydawnictwo: " + book1.publisher + ", ");
        System.out.println("ISBN: " + book1.isbn);

    }
}
