package module4.TheSimplestClassesAndObjects.Task8;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerDate {

   private final ArrayList<Customer> date;

    public CustomerDate(String customersGroup, ArrayList<Customer> date) {

        this.date = date;

    }

    public void sortName() {
        date.sort(Comparator.comparing(Customer::getLastName));
    }

    public ArrayList<Customer> getCustomerByCreditCardRange(String min, String max) {
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.date) {
            if (!(!(customer.getCardNumber().compareTo(min) > 0)
                    || 0 <= customer.getCardNumber().compareTo(max))) list.add(customer);
        }
        return list;
    }

    public void addCustomer(String lastName, String firstName, String patronymic, String address, String cardNumber, String bankAccountNumber) {
        this.date.add(new Customer(lastName, firstName, patronymic, address, cardNumber));
    }

    ArrayList<Customer> getDate() {
        return date;
    }

}

