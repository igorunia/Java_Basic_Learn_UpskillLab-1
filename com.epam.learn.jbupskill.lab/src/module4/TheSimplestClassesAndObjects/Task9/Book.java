package module4.TheSimplestClassesAndObjects.Task9;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Book {

    private final String title;
    private final String author;
    private final String publisher;
    private final String yearOfPublishing;
    private final String numberOfPages;
    private final String price;
    private final String bindingType;

    public Book(String title, String author, String publisher, String yearOfPublishing, String numberOfPages, String price, String bindingType) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing='" + yearOfPublishing + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", price='" + price + '\'' +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }
}
