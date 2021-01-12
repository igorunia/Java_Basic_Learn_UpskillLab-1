package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Подсчитать,сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task5 {
    public static void main(String[] args) {
        String text = "asagagag";
        StringBuilder countA = new StringBuilder(text);
        int counter = 0;
        for (int i = 0; i < countA.length(); i++) {
            if (countA.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
