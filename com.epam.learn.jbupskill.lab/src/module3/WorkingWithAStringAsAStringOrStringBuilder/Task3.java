package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Проверить, является ли заданное слово палиндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        String word = "101";
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String palindrome = builder.toString();
        System.out.println(palindrome);

        if (word == palindrome) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome!");
        }
    }
}
