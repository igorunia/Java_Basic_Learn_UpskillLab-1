package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task4 {
    public static void main(String[] args) {
        String word = "информатика";
        StringBuilder cake = new StringBuilder();
        int letterT = word.indexOf("т");
        char charT = word.charAt(letterT);
        int letterO = word.indexOf("о");
        char charO = word.charAt(letterO);
        int letterR = word.indexOf("р");
        char charR = word.charAt(letterR);
        cake.append(charT);
        cake.append(charO);
        cake.append(charR);
        cake.append(charT);

        String makeWord = cake.toString();
        System.out.println(makeWord);
    }
}
