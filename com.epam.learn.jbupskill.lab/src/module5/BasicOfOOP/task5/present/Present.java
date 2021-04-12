package module5.BasicOfOOP.task5.present;

import module5.BasicOfOOP.task5.Wrap;
import module5.BasicOfOOP.task5.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private String name;
    private Wrap wrap;
    private List<Product> products = new ArrayList<>();

    public Present() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Present{" +
                "name='" + name + '\'' +
                ", wrap=" + wrap +
                ", products=" + products +
                '}';
    }
}
