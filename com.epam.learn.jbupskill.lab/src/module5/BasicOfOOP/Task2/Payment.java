package module5.BasicOfOOP.Task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Goods> goods;
    private double balance;


    public Payment(double balance) {
        this.goods = new ArrayList<>();
        this.balance = balance;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addGoods(Goods product) {
        goods.add(product);
    }

    public void makePayment(double deposit) {
        if (balance < deposit) {
            System.out.println("You paid: " + deposit );
            double change = deposit - balance;
            System.out.println("Your change is: " + change );

        } else if (balance == deposit) {
            System.out.println("You paid: " + deposit);
            System.out.println("Thank you for paying without change.");
        } else {
            System.out.println("You paid: " + deposit);
            balance -= deposit;
            System.out.println("Balance of payment: " + balance);
        }
    }

}
