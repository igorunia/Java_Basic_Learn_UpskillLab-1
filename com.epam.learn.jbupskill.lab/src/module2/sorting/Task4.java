package module2.sorting;
//  Реализуйте сортировку вставками.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 7};
        System.out.println("The array: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int insert = array[i];
            int j = i - 1;
            while (j >= 0 && insert < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = insert;
        }
        System.out.println("The sorting insert of the array: " + Arrays.toString(array));
    }
}

