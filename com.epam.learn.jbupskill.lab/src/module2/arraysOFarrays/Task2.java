package module2.arraysOFarrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {

        int[][] squareMatrix = new int[][]{
                {1, 2, 7},
                {3, 4, 7},
                {5, 6, 7}};
        System.out.print("The main dioganal: ");
        for (int[] matrix : squareMatrix) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix == squareMatrix[j]) {
                    System.out.print(" " + matrix[j]);
                }
            }
        }
        System.out.println();
        System.out.print("The reverse dioganal: ");
        for (int[] matrix : squareMatrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix == squareMatrix[squareMatrix.length - 1 - j]) {
                    System.out.print(" " + matrix[j]);
                }
            }
        }
    }
}



