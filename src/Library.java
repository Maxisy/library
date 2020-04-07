public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";

        String title = "W pustyni i w puszczy";
        String author = "Henryk Sienkiewicz";
        int relaseDate = 2010;
        int pages = 296;
        String publisher = "Greg";
        String isbn = "9788373271890";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(title);
        System.out.println("Autor: " + author);
        System.out.println("Data wydania: " + relaseDate);
        System.out.println("Ilość stron: " + pages);
        System.out.println("Wydawca: " + publisher);
        System.out.println("ISBN: " + isbn);

    }
}
