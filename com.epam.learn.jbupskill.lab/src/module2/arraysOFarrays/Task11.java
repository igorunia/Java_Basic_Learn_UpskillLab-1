package module2.arraysOFarrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5
// встречается три и более раз.

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int lengthLines = 10;
        int lengthColumns = 20;
        int[][] squareMatrix = new int[lengthLines][lengthColumns];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                Random randomNumbers = new Random();
                int randomsNumbers = randomNumbers.nextInt(15);
                squareMatrix[i][j] = randomsNumbers;
                System.out.print(" " + squareMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Numbers of rows where number five meets three or more times: ");

        for (int i = 0; i < squareMatrix.length; i++) {
            int numberFive = 0;

            for (int j = 0; j < squareMatrix[i].length; j++) {
                Random randomNumbers = new Random();
                int randomsNumbers = randomNumbers.nextInt(15);
                squareMatrix[i][j] = randomsNumbers;
                if (squareMatrix[i][j] == 5) {
                    numberFive = numberFive + 1;
                }
            }
            if (numberFive >= 3) {
                System.out.print(" " + i + ";");
            }
        }
    }
}



