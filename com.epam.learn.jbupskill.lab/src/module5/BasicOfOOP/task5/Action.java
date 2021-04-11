package module5.BasicOfOOP.task5;


import module5.BasicOfOOP.task5.present.Present;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private List<Present> presents;

    public Action() {
        this.presents = new ArrayList<>();
    }

    public void printPresents(Present present) {
        System.out.println(present);

    }
}

