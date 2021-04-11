package module5.BasicOfOOP.task5.present;

import module5.BasicOfOOP.task5.Wrap;
import module5.BasicOfOOP.task5.products.Product;

public class PresentBuilder {
    Present present;

    private PresentBuilder() {
        this.present = new Present();
    }

    public static PresentBuilder newBuilder() {
        return new PresentBuilder();
    }

    public PresentBuilder withName(String name) {
        present.setName(name);
        return this;

    }

    public PresentBuilder withWrap(Wrap wrap) {
        present.setWrap(wrap);
        return this;
    }

    public Present build() {
        return present;
    }

    public PresentBuilder addProduct(Product product) {

        if (product.getPrice() <= 0) {
            System.out.println("It is not product");
        } else
            present.getProducts().add(product);
        return this;
    }

}
