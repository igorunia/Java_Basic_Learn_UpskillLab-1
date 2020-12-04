package module2.decompositionUsingmethods;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        getArrays(array);


    }

    public static int getArrays(int[] array) {
        int number = 0;
        if (almostIncreasingSequence(array)) {
            for (int i = 0; i < array.length; i++) {
                number = array[i];
                System.out.println(number);
            }

        }
        return number;
    }

    public static boolean almostIncreasingSequence(int[] array) {
        int seq = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                seq++;
            }
        }

        return !(seq > 0);
    }
}