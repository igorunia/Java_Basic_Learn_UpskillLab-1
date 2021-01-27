package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */
public class Task9 {
    public static void main(String[] args) {
        String text = "ABBabcf";

        StringBuilder counterLetter = new StringBuilder(text);
        int counterlittle = 0;
        int counterBig = 0;
        for (int i = 0; i < counterLetter.length(); i++) {
            if (counterLetter.charAt(i) >= 'a' && counterLetter.charAt(i) <= 'z') {
                counterlittle++;
            } else {
                counterBig++;
            }
        }
        System.out.println("Letter a little " + counterlittle);
        System.out.println("Letter a big " + counterBig);

    }
}
