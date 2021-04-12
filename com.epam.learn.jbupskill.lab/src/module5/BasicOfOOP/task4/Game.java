package module5.BasicOfOOP.task4;


import module5.BasicOfOOP.task4.jewels.Jewels;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Jewels> jewels;

    public Game() {
        this.jewels = new ArrayList<>();
    }

    public List<Jewels> getJewels() {
        return jewels;
    }

    public void setJewels(List<Jewels> jewels) {
        this.jewels = jewels;
    }

    public void addJewels(Jewels jewel) {
        jewels.add(jewel);
    }

    public void viewingJewels() {
        for (Jewels jewel : jewels) {
            System.out.println(jewel.getName() + " " +  jewel.getPrice());
        }
    }

    public void maxPriceJewels() {
        double max = 0;
        for (Jewels jewel : jewels) {
            if (jewel.getPrice() > max) {
                max = jewel.getPrice();
            }
        }
        System.out.println(max);
    }

    public void getSumJewels(double price) {
        for (Jewels jewel : jewels) {
            if (price == jewel.getPrice()) {
                System.out.println(jewel.getName() + " " + jewel.getPrice());
            }
        }
    }
}
