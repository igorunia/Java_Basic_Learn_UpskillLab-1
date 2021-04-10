package module5.BasicOfOOP.task5;

import module5.BasicOfOOP.task4.jewels.Jewels;
import module5.BasicOfOOP.task5.presents.Present;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private List<Present>presents;

    public Action() {
        this.presents = new ArrayList<>();
    }

    public List<Present> getPresents() {
        return presents;
    }

    public void setPresents(List<Present> presents) {
        this.presents = presents;
    }

    public void addPresent(Present present){
        presents.add(present);

    }

    public void viewingPresents() {
        for (Present present : presents) {
            System.out.println(present.getName() + " " +  present.getPrice());
        }
    }

}
