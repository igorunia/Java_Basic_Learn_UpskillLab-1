package module2.arraysOFarrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.


public class Task1 {
    public static void main(String[] args) {
        int[][] matrixArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if ((j + 1) % 2 != 0) {
                    System.out.print(matrixArray[i][j]);
                }
            }
            System.out.println();
        }
    }
}