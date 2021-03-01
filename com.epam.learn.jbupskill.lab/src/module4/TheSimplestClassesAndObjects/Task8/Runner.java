package module4.TheSimplestClassesAndObjects.Task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CustomerDate client = new CustomerDate(new ArrayList<>());

        client.addCustomer("B", "L", "S",
                "Minsk", "11111", "12345678");
        client.addCustomer("T", "A", "V",
                "Moscow", "2222", "23456789");
        client.addCustomer("S", "Y", "V",
                "T", "3333", "34567891");
        client.addCustomer("K", "S", "K",
                "Warsaw", "444", "45678912");
        client.addCustomer("S", "D", "A",
                "Brest", "55555", "56789123");

        System.out.println("The customers' list in the alphabetic order: ");
        client.sortName();
        for (int i = 0; i < client.getDate().size(); i++) {
            System.out.println(client.getDate().get(i));
        }

        System.out.println("-------------------------------------------------");

        System.out.println("The customers' list whose credit card number is in the indicated interval: ");
        List<Customer> list = client.getCustomerByCreditCardRange("2000", "500000");
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("The bank card is not found ");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
}

