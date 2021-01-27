package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "a as";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                builder.append("ab");
            } else {
                builder.append(text.charAt(i));
            }
        }
        String textA = builder.toString();
        System.out.println(textA);
    }
}
