package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 */
public class Task10 {
    public static void main(String[] args) {
        String X = "a!b.c?";
        StringBuilder coutSentence = new StringBuilder(X);
        int counter = 0;
        for (int i = 0; i < coutSentence.length(); i++) {
            if (coutSentence.charAt(i) == '!' || coutSentence.charAt(i) == '?' || coutSentence.charAt(i) == '.') {
                counter++;
            }
        }
        System.out.println("The sentence of " + counter);
    }
}
