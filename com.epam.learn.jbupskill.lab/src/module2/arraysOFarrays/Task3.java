package module2.arraysOFarrays;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void main(String[] args) {
        int[][] matrixArray = new int[][]{
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 7}};
        int lineK = 1;
        int columP = 0;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {

                if (i == lineK) {
                    System.out.print(" " + matrixArray[i][j]);
                }
                if (j == columP) {
                    System.out.print(" " + matrixArray[i][j]);
                }
            }
            System.out.println();
        }
    }
}

