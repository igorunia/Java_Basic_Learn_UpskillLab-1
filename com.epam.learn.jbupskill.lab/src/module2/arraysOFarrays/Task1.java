package module2.arraysOFarrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.


public class Task1 {
    public static void main(String[] args) {
        int[][] matrixArray = new int[][]{
                {6, 2, 9, 2},
                {5, 6, 7, 8}
        };
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                if ((j + 1) % 2 != 0 && matrixArray[0][j] > matrixArray[matrixArray.length - 1][j]) {
                    System.out.print(matrixArray[i][j] + " ");
                }
            }
            System.out.println( );
        }
    }
}

