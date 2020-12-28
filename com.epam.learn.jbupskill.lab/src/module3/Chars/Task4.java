package module3.Chars;

/**
 * В строке найти количество чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        String text = "I am 0 736306    hhhh  87";
        System.out.println(text);
        char[] textCharsArray = text.toCharArray();
        int digitCounter = 0;
        int numberCounter = 0;

        for (int i = 0; i < textCharsArray.length; i++) {
            if (isDigit(textCharsArray[i])) {
                digitCounter++;
                numberCounter++;
                while (i < textCharsArray.length-1 && isDigit(textCharsArray[i + 1])) {
                    i++;
                    digitCounter++;
                }
            }
        }

        System.out.println(numberCounter);
        System.out.println(digitCounter);
    }

    private static boolean isDigit(char c) {

        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }

    }
}



