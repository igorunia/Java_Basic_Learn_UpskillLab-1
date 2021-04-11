package module5.BasicOfOOP.task5;


import module5.BasicOfOOP.task5.present.Present;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private List<Present> presents;

    public Action() {
        this.presents = new ArrayList<>();
    }

    public List<Present> getPresents() {
        return presents;
    }

    public void setPresents(List<Present> presents) {
        this.presents = presents;
    }

    public void addPresents(Present present){
        presents.add(present);
    }

    public void printPresents(Present present) {
        System.out.println(present);

    }
}

