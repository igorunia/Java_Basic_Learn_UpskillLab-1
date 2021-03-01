package module4.TheSimplestClassesAndObjects.Task8;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {


    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final String address;
    private final String cardNumber;


    public Customer(String lastName, String firstName, String patronymic, String address, String cardNumber) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Customer{lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                                '}';
    }

    String getLastName() {
        return lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }


}
