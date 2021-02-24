package module4.TheSimplestClassesAndObjects.Task9;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Store store = new Store("Book store", new ArrayList<>());
        store.addBook("Y P U", "M C", "H C",
                "2008", "43", "22", "hardcover");
        store.addBook("A and M of M", "A M", "N Y R of B",
                "2002", "72", "20", "paperback");
        store.addBook("L S", "M C", "N Y R of B",
                "2010", "52", "16", "paperback");
        store.addBook("F", "R B", "S & S",
                "2012", "25", "14", "paperback");
        store.addBook("A A of K and C", "M C", "R H P G",
                "2012", "70", "15", "paperback");

        System.out.println("books by M C at the store:");
        ArrayList<Book> autorsBook = store.authorsBooks("M C");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println("-------------------------------------------------");

        System.out.println("books published by N Y R of B :");
        ArrayList<Book> publishersBook = store.publishersBook("N Y R of B");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println("books released after 2010:");
        ArrayList<Book> releasedAfter = store.releasedAfter("2010");
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }

}
