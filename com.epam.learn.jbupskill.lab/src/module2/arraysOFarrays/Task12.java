package module2.arraysOFarrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 2, 1},
                {5, 3, 2},
                {5, 2, 1}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] > matrix[i + 1][j + 1]) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i + 1][j + 1];
                    matrix[i + 1][j + 1] = tmp;
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}