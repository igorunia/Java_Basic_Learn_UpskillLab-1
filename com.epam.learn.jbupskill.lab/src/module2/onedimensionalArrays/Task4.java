package module2.onedimensionalArrays;
// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double[] realNumbers = new double[]{2, 2, 3, 6, 5, 15, 8, 8, 9, 1};
        System.out.println(Arrays.toString(realNumbers));
        int min = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < realNumbers.length; i++) {
            if (realNumbers[i] < realNumbers[min]) {
                min = i;
            }
            if (realNumbers[i] > realNumbers[max]) {
                max = i;
            }
        }
        temp = (int) realNumbers[min];
        realNumbers[min] = realNumbers[max];
        realNumbers[max] = temp;
        System.out.print(Arrays.toString(realNumbers));
    }
}



