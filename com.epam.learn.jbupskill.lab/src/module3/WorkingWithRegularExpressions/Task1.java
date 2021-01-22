package module3.WorkingWithRegularExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cоздать приложение,разбирающее текст(текст хранится в строке)и позволяющее выполнять с текстом
 * три различных операции:отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "befnknjnfjknekjn. jnfsjksnn. kfjejkjknkjsnjk.\n njsnsnjnsns.njwnsjkns.\n dsjanfjksanfjfkgjsjs. " +
                "ahfgahgfhaghah.jkafajjhffajhjfah.ajafhahjafhahjzfkahfjah.\n";

        System.out.println("Choose one of the sorting method: 1 - method1, 2 - method2, 3 - method3");
        Scanner scanner = new Scanner(System.in);
        int method = scanner.nextInt();
        if (method == 1) {
            ArrayList<String> listText = new ArrayList<>();
            Pattern pattern = Pattern.compile("[^\\\\n]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String group = matcher.group();
                listText.add(group);

                listText.sort(new Comparator<String>() {
                    @Override
                    public int compare(String a, String b) {
                        return Integer.compare(sentenceCount(a), sentenceCount(b));
                    }
                });

                System.out.print(group);
            }
        }


        if (method == 2) {
            ArrayList<String> listText = new ArrayList<>();
            Pattern pattern = Pattern.compile("[^.]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String group = matcher.group();
                listText.add(group);

                listText.sort(new Comparator<String>() {
                    @Override
                    public int compare(String a, String b) {
                        return Integer.compare(sentenceWordCount(a), sentenceWordCount(b));
                    }
                });

                System.out.print(group);
            }
        }


    }

    private static int sentenceCount(String group) {
        ArrayList<String> listText = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^.]+");
        Matcher matcher = pattern.matcher(group);
        while (matcher.find()) {
            String group2 = matcher.group();
            listText.add(group2);
        }
        return listText.size();

    }

    private static int sentenceWordCount(String group) {
        ArrayList<String> listText = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^\\s]+");
        Matcher matcher = pattern.matcher(group);
        while (matcher.find()) {
            String group3 = matcher.group();
            listText.add(group3);
        }
        return listText.size();
    }
}