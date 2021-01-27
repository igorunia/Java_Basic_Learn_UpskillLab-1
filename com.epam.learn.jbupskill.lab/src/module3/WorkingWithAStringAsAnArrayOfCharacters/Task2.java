package module3.WorkingWithAStringAsAnArrayOfCharacters;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
    public static void main(String[] args) {
        String word = "word word word thr";

        System.out.println(word);
        char[] wordCharsArray = word.toCharArray();

        int countWordInString = 0;

        for (int i = 0; i < wordCharsArray.length; i++) {
            if (i + 3 < wordCharsArray.length && wordCharsArray[i] == 'w'
                    && wordCharsArray[i + 1] == 'o'
                    && wordCharsArray[i + 2] == 'r'
                    && wordCharsArray[i + 3] == 'd') {
                countWordInString++;
            }
        }
        char[] letterCharsArray = new char[wordCharsArray.length + countWordInString * 2];
        int letterCounter = 0;

        for (int i = 0; i < wordCharsArray.length; i++) {
            if (i + 3 < wordCharsArray.length && wordCharsArray[i] == 'w'
                    && wordCharsArray[i + 1] == 'o'
                    && wordCharsArray[i + 2] == 'r'
                    && wordCharsArray[i + 3] == 'd') {
                letterCharsArray[letterCounter++] = 'l';
                letterCharsArray[letterCounter++] = 'e';
                letterCharsArray[letterCounter++] = 't';
                letterCharsArray[letterCounter++] = 't';
                letterCharsArray[letterCounter++] = 'e';
                letterCharsArray[letterCounter++] = 'r';
                i += 3;
            } else {
                letterCharsArray[letterCounter++] = wordCharsArray[i];
            }
        }

        String newWord = new String(letterCharsArray);
        System.out.println(newWord);
    }

}


