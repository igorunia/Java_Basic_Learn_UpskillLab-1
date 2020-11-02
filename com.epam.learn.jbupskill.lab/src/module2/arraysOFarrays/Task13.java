package module2.arraysOFarrays;

// Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {2, 1, 2},
                {5, 5, 6},
                {3, 7, 8}
        };
        int sorting = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[k][j]) {
                        sorting = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = sorting;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

