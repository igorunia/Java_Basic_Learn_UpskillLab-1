package module4.TheSimplestClassesAndObjects.Task9;

import java.util.ArrayList;

public class Store {
    public final String bookStoreName;
    private final ArrayList<Book> bookList;

  public Store(String libraryName, ArrayList<Book> bookList) {
        this.bookStoreName = libraryName;
        this.bookList = bookList;
    }
   public void addBook(String title, String author, String publisher, String yearOfPublishing, String numberOfPages, String price, String bindingType) {
        this.bookList.add(new Book(title, author, publisher, yearOfPublishing, numberOfPages, price, bindingType));
    }

    ArrayList<Book> authorsBooks(String author) {
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    ArrayList<Book> publishersBook(String publisher) {
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> releasedAfter(String year) {
        ArrayList<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYearOfPublishing().equalsIgnoreCase(year)) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

}
