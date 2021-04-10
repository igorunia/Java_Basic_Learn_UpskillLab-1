package module5.BasicOfOOP.task5.presents;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private String name;
    private double price;
    private List<Wrap> wrap;
    private List<Product> product;

    public Present(String name, double price) {
        this.name = name;
        this.price = price;
        this.wrap = new ArrayList<>();
        this.product = new ArrayList<>();
    }

    public Present(Wrap box, Candy mars, Product car) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Wrap> getWrap() {
        return wrap;
    }

    public void setWrap(List<Wrap> wrap) {
        this.wrap = wrap;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
