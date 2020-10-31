package module2.arraysOFarrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},};
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int sumColumn = 0;
            for (int j = 0; j < array[0].length; j++) {
                sumColumn += array[i][j];
            }
            maxSum = Math.max(sumColumn, maxSum);
        }
        System.out.print("The max sum = " + maxSum);
    }
}
