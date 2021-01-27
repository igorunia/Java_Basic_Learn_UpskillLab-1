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
        String text = "aa. aaaaa. a!\n" +
                "Второй абзац. Пять предложений. Это третье предложение. Это четвертое. И это пятое...\n" +
                "Третий абзац и всего одно предложение.\n" +
                "Четвертый абзац. Привет, приветы, приветули.";

        System.out.println("Choose one of the sorting method:\n" +
                " 1 - отсортировать абзацы по количеству предложений;\n" +
                " 2 - в каждом предложении отсортировать слова по длине;\n" +
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
            for (String word : listText) {
                List<String> listWords = new ArrayList<>();
                Pattern pattern2 = Pattern.compile("[^\\s]+");
                Matcher matcher2 = pattern2.matcher(word);
                while (matcher2.find()) {
                    String group2 = matcher2.group();
                    listWords.add(group2);
                }
                listWords.sort((a,b)-> Integer.compare(a.length(),b.length()));

                for(String word2 : listWords) {

                    System.out.print(word2 + " ");
                }
                System.out.println(".");
            }
        }
        if (method == 3) {
            List<String> listText = new ArrayList<>();
            Pattern pattern = Pattern.compile("[^.!?]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String group3 = matcher.group();
                listText.add(group3);
            }
            for (String word3 : listText) {
                List<String> listWords3 = new ArrayList<>();
                Pattern pattern3 = Pattern.compile("(\\w)\\1+");
                Matcher matcher3 = pattern3.matcher(word3);
                while (matcher3.find()) {
                    String group3 = matcher3.group();
                    listWords3.add(group3);
                }
                listWords3.sort(Comparator.comparingInt(Task1::lexmeCount));

                for(String word4 : listWords3) {

                    System.out.print(word4 + " ");
                }
                System.out.println(".");
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
    private static int lexmeCount(String group) {
        List<String> listText = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\w)\\1+");
        Matcher matcher = pattern.matcher(group);
        while (matcher.find()) {
            String group2 = matcher.group();
            listText.add(group2);
        }
        return listText.size();
    }

}
