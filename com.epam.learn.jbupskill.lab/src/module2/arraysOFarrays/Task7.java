package module2.arraysOFarrays;
//Сформировать квадратную матрицу порядка N по правилу:A[i, j]=sin((i 2 -j 2 )/N)и подсчитать количество положительных элементов в ней.

public class Task7 {

    public static void main(String[] args) {
        int lengthN = 2;
        double[][] squareMatrix = new double[lengthN][lengthN];
        int count = 0;

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = Math.asin((((Math.pow(i, 2)) - (Math.pow(j, 2))) / lengthN));
                System.out.print(" " + squareMatrix[i][j]);
                if (squareMatrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Positive numbers = " + count);
    }
}
