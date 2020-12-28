package module3.Chars;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {
        String text = "My  l";
        char[] textCharsArrays = text.toCharArray();
        int spaceCounter = 0;
        for (int i = 0; i < textCharsArrays.length-1; i++) {
            if (textCharsArrays[i] == ' ' && textCharsArrays[i + 1] == ' ') {
                spaceCounter++;
            }
        }
        char[] newTextCharsArrays = new char[textCharsArrays.length - spaceCounter];


        for (int i = 0; i < textCharsArrays.length + 1; i++) {
            if (textCharsArrays[i] == ' ' && textCharsArrays[i + 1] == ' ') {
                textCharsArrays[i] = ' ';

            } else {
                newTextCharsArrays = textCharsArrays;
            }
        }
        String newText = new String(newTextCharsArrays);
        System.out.println(newText);
    }
}
