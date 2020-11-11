package module2.sorting;
// Реализуйте сортировку выбором.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 7};
        System.out.println("The array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println("The selection sorting of the array: " + Arrays.toString(array));
    }
}