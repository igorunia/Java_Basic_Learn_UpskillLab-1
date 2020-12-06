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
        getNewArray(array, n);

    }

    public static int getNewArray(int[] array, int n) {
        int rez = 0;
        for (int i = 0; i < array.length; i++) {
            rez = array[i];
            rez = n;
        }
        System.out.println(Arrays.toString(array));
        return rez;
    }
}
