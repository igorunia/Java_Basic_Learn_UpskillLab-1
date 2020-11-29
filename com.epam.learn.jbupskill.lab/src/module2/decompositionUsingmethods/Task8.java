package module2.decompositionUsingmethods;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
 * элементов массива с номерами от k до m.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(getSumofArray(array));

    }

    public static int getSumofArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 3; i += 3) {
            for (int j = i + 3; j < array.length; j += 3) {
                sum += array[i];
            }

        }
        return sum;
    }

}
