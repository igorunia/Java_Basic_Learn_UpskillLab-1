package module2.decompositionUsingmethods;

import java.util.Arrays;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами
 * которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 8;
        int[] array = new int[]{1, 2, 3, 4};
        getNewarray(array,n);

    }

    public static void getNewarray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
        }
        System.out.println(Arrays.toString(array));
    }
}
