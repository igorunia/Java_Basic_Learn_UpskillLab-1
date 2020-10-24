package module2.onedimensionalArrays;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < integerNumbers.length; i++) {
            if (i % 2 == 0) {
                integerNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(integerNumbers));
    }
}
