package module2.onedimensionalArrays;
//Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[]{2, 2, 3, 1, 5, 6, 7, 8};
        System.out.println(Arrays.toString(integerNumbers));
        int min = integerNumbers[0];
        int count = 0;
        for (int i = 1; integerNumbers.length > i; i++) {  //Находит минимальное значение
            if (integerNumbers[i] < min) {
                min = integerNumbers[i];
            }
        }
            for (int countindex : integerNumbers) { // находит сколько индексов принимает минимальное значение
                if (countindex == min) {
                    count++;
                }
            }
            int[] newIntegerNumbers = newIntegerNumbers = new int[integerNumbers.length - count]; // уменьшает длинну массива на столько индексов в котрых были минимальные значения
            int indexResult = 0;
            for (int i = 0; i < integerNumbers.length; i++) {    // В старом массиве провереят все индексы значения которых не принимаю минимальное и присваевает его новому массиву
                if (integerNumbers[i] != min) {
                    newIntegerNumbers[indexResult] = integerNumbers[i];
                    indexResult++;
                }
            }
            System.out.println(Arrays.toString(newIntegerNumbers));
        }
    }

