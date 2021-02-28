package module4.TheSimplestClassesAndObjects.Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class CustomerDate {

    private final List<Customer> date;

    public CustomerDate(List<Customer> date) {

        this.date = date;

    }

    public void sortName() {
        date.sort(Comparator.comparing(Customer::getLastName));
    }

    public List<Customer> getCustomerByCreditCardRange(String min, String max) {
        Long minNumber = Long.parseLong(min);
        Long maxNumber = Long.parseLong(max);

        List<Customer> list = new ArrayList<>();
        for (Customer customer : this.date) {
            long cardNumber = Long.parseLong(customer.getCardNumber());
            if (isBetween(cardNumber, minNumber, maxNumber)) {
                list.add(customer);
            }
        }
        return list;
    }

    private boolean isBetween(long cardNumber, Long minNumber, Long maxNumber) {
        return cardNumber > minNumber && cardNumber <= maxNumber;
    }

    public void addCustomer(String lastName, String firstName, String patronymic, String address, String cardNumber, String bankAccountNumber) {
        this.date.add(new Customer(lastName, firstName, patronymic, address, cardNumber));
    }

    List<Customer> getDate() {
        return date;
    }

}

