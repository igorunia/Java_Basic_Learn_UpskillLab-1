package module3.WorkingWithAStringAsAnArrayOfCharacters;

/**
 * В строке найти количество цифр.
 */
public class Task3 {
    public static void main(String[] args) {
        String text = "I am 27. My birthday is on the 21 april";
        System.out.println(text);

        char[] textCharsArray = text.toCharArray();
        int numberCounter = 0;

        for (int i = 0; i < textCharsArray.length; i++) {
            if (textCharsArray[i] >= 48 && textCharsArray[i] <= 57) {
                numberCounter++;
            }
        }
        System.out.println(numberCounter);
    }
}
