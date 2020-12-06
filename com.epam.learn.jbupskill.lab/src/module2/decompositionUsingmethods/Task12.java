package module2.decompositionUsingmethods;

import java.util.Arrays;
import java.util.Random;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {
    private static final Random RANDOM_NUMBERS = new Random();

    public static void main(String[] args) {
        int k = 60;
        int n = 6;
        getArray(k, n);
    }

    public static int getArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void getArray(int n, int k) {
        int[] array = new int[2];
        int i = 0;
        while (getArraySum(array) < k) {
            array = increaseArray(array, i);
            int arraySum = getArraySum(array);
            if (arraySum + n - 1 > k) {
                array[i] = k - arraySum;
            } else {
                array[i] = RANDOM_NUMBERS.nextInt(n);
            }
            i++;
        }

        System.out.println("Get array " + Arrays.toString(array));
    }

    private static int[] increaseArray(int[] array, int i) {
        if (i == array.length) {
            array = Arrays.copyOf(array, array.length + 2);
        }
        return array;
    }
}
