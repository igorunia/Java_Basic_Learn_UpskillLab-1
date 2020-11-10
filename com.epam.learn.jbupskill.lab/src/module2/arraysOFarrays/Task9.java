package module2.arraysOFarrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {8, 3, 4},
                {8, 1, 6},};
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < array.length; j++) {
            int sumColumn = 0;
            for (int i = 0; i < array[j].length; i++) {
                sumColumn += array[i][j];
            }
            maxSum = Math.max(sumColumn, maxSum);
        }
        System.out.print("The max sum in column = " + maxSum);
    }
}
