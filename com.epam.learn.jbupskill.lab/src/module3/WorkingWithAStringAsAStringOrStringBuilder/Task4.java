package module3.WorkingWithAStringAsAStringOrStringBuilder;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task4 {
    public static void main(String[] args) {
        String word = "информатика";
        StringBuilder cake = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'т') {
                cake.append('т');
                cake.indexOf("т");
            }

            if (word.charAt(i) == 'о') {
                cake.append('о');
                cake.indexOf("о");
            }
            if (word.charAt(i) == 'р') {
                cake.append('р');
                cake.indexOf("р");
            }
            if (word.charAt(i) == 'т') {
                cake.append('т');
                cake.indexOf("т");
            }
        }
        String makeWord = cake.toString();
        System.out.println(makeWord);
    }
}
