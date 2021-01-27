package module3.WorkingWithAStringAsAnArrayOfCharacters;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */
public class Task1 {
    public static void main(String[] args) {
        String camelCase = "camelCase";
        System.out.println(camelCase);
        char[] camelCaseCharsArrays = camelCase.toCharArray();
        int countTitleCharacter = 0;
        for (int i = 0; i < camelCaseCharsArrays.length; i++) {
            if (camelCaseCharsArrays[i] >= 'A' && camelCaseCharsArrays[i] <= 'Z') {
                countTitleCharacter++;
            }
        }
        char[] snake_caseCharsArrays = new char[camelCaseCharsArrays.length + countTitleCharacter];
        int countSnake = 0;
        for (int i = 0; i < camelCaseCharsArrays.length; i++) {
            if (camelCaseCharsArrays[i] >= 'A' && camelCaseCharsArrays[i] <= 'Z') {
                if (i > 0) {
                    snake_caseCharsArrays[countSnake++] = '_';
                }
                snake_caseCharsArrays[countSnake++] = (char) (camelCaseCharsArrays[i] + 32);
            } else {
                snake_caseCharsArrays[countSnake++] = camelCaseCharsArrays[i];
            }
        }
        String snake_case = new String(snake_caseCharsArrays);
        System.out.println(snake_case);
    }
}


