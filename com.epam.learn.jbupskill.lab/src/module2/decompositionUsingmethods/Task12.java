package module2.decompositionUsingmethods;

import java.util.Arrays;
import java.util.Random;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {
    public static void main(String[] args) {
        int k = 60;
        int n = 6;
        getArray(n);
    }

    public static int getArraysum(int k) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void getArray(int n) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random randomNumbers = new Random();
            int randomsNumbers = randomNumbers.nextInt(n);
            array[i]=randomsNumbers;
        }
        System.out.println("Get array " + Arrays.toString(array));
    }
}