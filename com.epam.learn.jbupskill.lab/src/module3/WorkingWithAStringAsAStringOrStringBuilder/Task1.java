package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
    public static void main(String[] args) {

        String text = "T E  X   T";
        StringBuilder builder = new StringBuilder(text);
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCounter < counter) {
                    maxCounter = counter;
                }
                counter = 0;
            }
        }
        System.out.println(maxCounter);
    }
}
