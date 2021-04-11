package module5.BasicOfOOP.task5.products;

public class Candy extends Product {


    public Candy(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
