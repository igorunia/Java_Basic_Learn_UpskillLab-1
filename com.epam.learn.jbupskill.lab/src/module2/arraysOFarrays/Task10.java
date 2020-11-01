package module2.arraysOFarrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
    public static void main(String[] args) {
        int[][] squareMatrix = new int[][]{
                {1, 2, 7},
                {3, -4, 7},
                {5, 6, 7}};

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                if (squareMatrix[i] == squareMatrix[j]) {
                    if (squareMatrix[i][j] >= 0) {
                        System.out.print(" " + squareMatrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}


