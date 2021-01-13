package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        String text = "year";
        StringBuilder doubleText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'y') {
                doubleText.append("yy");
            }
            if (text.charAt(i) == 'e') {
                doubleText.append("ee");
            }
            if (text.charAt(i) == 'a') {
                doubleText.append("aa");
            }
            if (text.charAt(i) == 'r') {
                doubleText.append("rr");
            }
        }
        String makeNewtext = doubleText.toString();
        System.out.println(makeNewtext);
    }
}
