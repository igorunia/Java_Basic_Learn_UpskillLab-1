package module3.WorkingWithAStringAsAnArrayOfCharacters;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {
        String text = "My  l";
        char[] textCharsArrays = text.toCharArray();
        int spaceCounter = 0;
        for (int i = 0; i < textCharsArrays.length - 1; i++) {
            if (textCharsArrays[i] == ' ' && textCharsArrays[i + 1] == ' ') {
                spaceCounter++;
            }
        }
        char[] newTextCharsArrays = new char[textCharsArrays.length - spaceCounter];
        int count = 0;

        for (int i = 0; i < textCharsArrays.length; i++) {
            if (i < textCharsArrays.length - 1 && textCharsArrays[i] == ' ' && textCharsArrays[i + 1] == ' ') {
                newTextCharsArrays[count++] = ' ';
                while (i + 1 < textCharsArrays.length && textCharsArrays[i + 1] == ' ') {
                    i++;
                }

            } else {
                newTextCharsArrays[count++] = textCharsArrays[i];
            }
        }
        String newText = new String(newTextCharsArrays);
        System.out.println(newText);

        int spaceCounter2 = 0;
        if (newTextCharsArrays[0] == ' ') {
            spaceCounter2++;
        }
        if (newTextCharsArrays[newTextCharsArrays.length - 1] == ' ') {
            spaceCounter2++;
        }
    }
}



