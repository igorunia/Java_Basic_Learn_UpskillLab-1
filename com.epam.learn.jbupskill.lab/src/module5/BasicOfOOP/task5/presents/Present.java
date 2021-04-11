package module5.BasicOfOOP.task5.presents;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private String name;
    private double price;
    private Wrap wrap;
    private List<Product> product;

    public Present(String name, double price, Wrap wrap) {
        this.name = name;
        this.price = price;
        this.wrap = wrap;
        this.product = new ArrayList<>();
    }

    public Present() {

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

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Present(Wrap wrap, Product product) {
        this.product.add(product);

    }

}
