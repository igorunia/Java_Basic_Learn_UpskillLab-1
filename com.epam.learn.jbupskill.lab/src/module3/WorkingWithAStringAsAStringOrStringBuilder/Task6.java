package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        String text = "year";
        StringBuilder doubleText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            doubleText.append(ch).append(ch);
        }

        String makeNewtext = doubleText.toString();
        System.out.println(makeNewtext);
    }
}
