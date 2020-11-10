package module2.arraysOFarrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
    public static void main(String[] args) {
        int[][] squareMatrix = new int[][]{
                {1, 2, 7},
                {3, 3, 7},
                {5, 6, 7}};

        for (int[] matrix : squareMatrix) {
            for (int i : matrix) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        System.out.print("The pozitive elements of main dioganal:");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                if (i == j && squareMatrix[i][j] >= 0) {
                    System.out.print(" " + squareMatrix[i][j] + ";");
                }
            }
        }
    }
}



