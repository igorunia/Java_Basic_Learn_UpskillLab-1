package module4.AggregationAndComposition.Task1;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Runner {
    public static void main(String[] args) {
        Word heading = new Word("Ste Les");
        String line1 = "Wen I dink coe in thng and sll tough he" +
                " twier fes of m pot frids, I s marial tt Max wod" +
                " aprecte, fom mees abot th redisibuion of walh t" +
                " liteatre aot th Demortic Soialss o merca.\n";

        Sentence sentence = new Sentence(line1);
        Text text2 = new Text(heading, sentence);

        String line2 = "The oppre of mon e fe s paty wt  y " +
                "frds tord tse copts; te racm, sesm, ad botry at" +
                " ae uniy ebled y eonoic ineuaiy re alo reonsile.\n";

        String line3 = "May of y frds bieve tat clite chge wll rure stng" +
                " govmet maget of insty ad entpis. Soe, I tnk, ee" +
                " socalim as a ol to brk own th ideogies f injstice hat " +
                "hlped elet Doald Trmp.\n";
        text2.addSentence(new Sentence(line2));
        text2.addSentence(new Sentence(line3));

        text2.printHeading();
        text2.printText();

    }
}
