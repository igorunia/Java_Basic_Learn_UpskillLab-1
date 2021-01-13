package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Вводится строка.
 * Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef"
 */
public class Task7 {
    public static void main(String[] args) {
        String text = "abc cde def";
        StringBuilder deleteOddtext = new StringBuilder(text);

        for (int i = 0; i < deleteOddtext.length(); i++) {
            if (deleteOddtext.charAt(i) == ' ') {
                deleteOddtext.deleteCharAt(i);
                i--;
            }


            for (int j = i + 1; j < deleteOddtext.length(); j++) {
                if (deleteOddtext.charAt(j) == deleteOddtext.charAt(i)) {
                    deleteOddtext.deleteCharAt(j);
                }
            }
        }

        String makeNewtex = deleteOddtext.toString();
        System.out.println(makeNewtex);
    }
}
