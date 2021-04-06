package module5.BasicOfOOP.task4.jewels;

public class ValuableMetals extends Jewels{
    public ValuableMetals(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "ValuableMetals{}";
    }
}
