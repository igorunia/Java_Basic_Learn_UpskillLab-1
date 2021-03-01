package module4.TheSimplestClassesAndObjects.Task9;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final String bookStoreName;
    private final List<Book> bookList;

    public Store(String libraryName) {
        this.bookStoreName = libraryName;
        this.bookList = new ArrayList<>();
    }

    public Store(String libraryName, List<Book> bookList) {
        this.bookStoreName = libraryName;
        this.bookList = bookList;
    }

    public void addBook(String title, String author, String publisher, String yearOfPublishing, String numberOfPages, String price, String bindingType) {
        this.bookList.add(new Book(title, author, publisher, yearOfPublishing, numberOfPages, price, bindingType));
    }

    List<Book> authorsBooks(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    List<Book> publishersBook(String publisher) {
        List<Book> publisherList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    List<Book> releasedAfter(String year) {
        List<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYearOfPublishing().equalsIgnoreCase(year)) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

    public String getBookStoreName() {
        return bookStoreName;
    }
}
