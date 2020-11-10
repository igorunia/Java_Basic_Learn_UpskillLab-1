package module2.arraysOFarrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {6, 7, 2},
                {5, 8, 1},
                {2, 5, 7}
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
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        sorting = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = sorting;
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        sorting = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = sorting;
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