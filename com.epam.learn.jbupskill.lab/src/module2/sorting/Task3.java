package module2.sorting;
//  Реализуйте сортировку обменами

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 7};
        System.out.println("The array: " + Arrays.toString(array));
        boolean sorted = false;
        int change;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    change = array[i];
                    array[i] = array[i+1];
                    array[i+1] = change;
                    sorted = false;
                }
            }
        }
        System.out.println("The sorting changes of the array: " + Arrays.toString(array));
    }
}
