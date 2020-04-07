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
        System.out.print(title + ", ");
        System.out.print("Autor: " + author + ", ");
        System.out.print("Data wydania: " + relaseDate + ", ");
        System.out.print("Ilość stron: " + pages + ", ");
        System.out.print("Wydawca: " + publisher + ", ");
        System.out.println("ISBN: " + isbn);

    }
}
