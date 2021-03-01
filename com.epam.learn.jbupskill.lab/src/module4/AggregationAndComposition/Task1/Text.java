package module4.AggregationAndComposition.Task1;

import java.util.ArrayList;

public class Text {
    private final Word heading;
    private final ArrayList<Sentence> content;

  public Text(Word heading) {
        this.heading = heading;
        this.content = new ArrayList<>();
    }

    public Text(Word heading, ArrayList<Sentence> content) {
        this.heading = heading;
        this.content = content;
    }

    Text(Word heading, Sentence sentence) {
        this.heading = heading;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }

    void addSentence(Sentence sentence) {
        this.content.add(sentence);
    }

    void printText() {
        for (Sentence sentence : this.content) {
            System.out.print(sentence);
        }
    }

    void printHeading() {
        System.out.println(heading);
    }

}

