package module3.WorkingWithRegularExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cоздать приложение,разбирающее текст(текст хранится в строке)и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,а в случае равенства – по алфавиту.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "befnknj. jnfsjksnnamafmna. kfjejkjknkj.\n njsnsnjnsns.\n dsjanfjksanfjfkgjsjs. " +
                "ahfgahgfhaghah. jkafajjhffajhjfah. ajafhahjafhahjzfkahfjah.\n";

        System.out.println("Choose one of the sorting method:\n" +
                " 1 - отсортировать абзацы по количеству предложений;\n" +
                " 2 - в каждом предложении отсортировать слова по длинне;\n" +
                " 3 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,а в случае равенства – по алфавиту.");
        Scanner scanner = new Scanner(System.in);
        int method = scanner.nextInt();
        if (method == 1) {
            List<String> listText = new ArrayList<>();
            Pattern pattern = Pattern.compile("[^\\n]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String group = matcher.group();
                listText.add(group);
            }

            listText.sort(Comparator.comparingInt(Task1::sentenceCount));
            for (String s : listText) {

                System.out.println(s);
            }
        }


        if (method == 2) {
            List<String> listText = new ArrayList<>();
            Pattern pattern = Pattern.compile("[^.!?]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String group2 = matcher.group();
                listText.add(group2);
            }

            listText.sort((a, b) -> Integer.compare(sentenceWordCount(a), sentenceWordCount(b)));

            for (String word : listText) {

                System.out.println(word);
            }

        }

    }

    private static int sentenceCount(String group) {
        List<String> listText = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^.!?]+");
        Matcher matcher = pattern.matcher(group);
        while (matcher.find()) {
            String group2 = matcher.group();
            listText.add(group2);
        }
        return listText.size();

    }

    private static int sentenceWordCount(String group) {
        List<String> listText = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^\\s]+");
        Matcher matcher = pattern.matcher(group);
        while (matcher.find()) {
            String group3 = matcher.group();
            listText.add(group3);
        }
        return listText.size();
    }
}
