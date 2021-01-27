package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Вводится строка.
 * Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef"
 */
public class Task7 {
    public static void main(String[] args) {
        String text = "  abc cde def";
        StringBuilder deleteOddtext = new StringBuilder(text);

        for (int i = 0; i < deleteOddtext.length(); i++) {
            if (deleteOddtext.charAt(i) == ' ') {
                deleteOddtext.deleteCharAt(i);
                i--;
            }
        }

        for (int i = 0; i < deleteOddtext.length() - 1; i++) {
            if (deleteOddtext.charAt(i) == deleteOddtext.charAt(i + 1)) {
                deleteOddtext.deleteCharAt(i);
                i--;
            }
        }

        String makeNewtex = deleteOddtext.toString();
        System.out.println(makeNewtex);
    }
}
