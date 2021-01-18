package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
    public static void main(String[] args) {
        String text = "the on next";
        StringBuilder searchLengthword = new StringBuilder(text);
        int maxLenght = 0;
        int index = 0;

        int firstIndex = 0;
        while (firstIndex < text.length() - 1) {
            int lastIndex = searchLengthword.indexOf(" ", firstIndex);
            if (lastIndex == -1) {
                lastIndex = text.length();
            }
            int localMax = lastIndex - firstIndex;// length the word in the text
            if (localMax > maxLenght) {
                maxLenght = localMax;
                index = firstIndex;
            }
            firstIndex = lastIndex + 1;
        }
        System.out.println(maxLenght);
        System.out.println(searchLengthword.substring(index, index + maxLenght));

    }
}
