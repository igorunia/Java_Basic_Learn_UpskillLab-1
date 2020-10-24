package module2.onedimensionalArrays;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[]{2, -2, 3, 4, 1, 8, 1};
        for (int i = 0; i < integerNumbers.length; i++) {

            if (integerNumbers[i] > i) {
                System.out.print(integerNumbers[i] + " ");
            }
        }

    }
}
