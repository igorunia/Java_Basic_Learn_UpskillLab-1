package module2.arraysOFarrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5
// встречается три и более раз.

public class Task11 {
    public static void main(String[] args) {
        int lengthLines = 10;
        int lengthColumns = 20;
        int[][] squareMatrix = new int[lengthLines][lengthColumns];
        int[] lineMatrix = new int[lengthLines];
        int amountRow = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            int numberFive = 0;
            for (int j = 0; j < squareMatrix[i].length; j++) {
                int randomNumbers = (int) (Math.random() * 15);
                squareMatrix[i][j] = randomNumbers;
                System.out.print(" " + squareMatrix[i][j]);
                if (squareMatrix[i][j] == 5) {
                    numberFive = numberFive + 1;
                }
                if (numberFive >= 3) {
                    amountRow = amountRow + 1;
                    lineMatrix[amountRow] = i;
                }
            }
            System.out.println();
        }
        System.out.print("Numbers of rows where number five meets three or more times: " + lineMatrix[amountRow]);
    }
}
