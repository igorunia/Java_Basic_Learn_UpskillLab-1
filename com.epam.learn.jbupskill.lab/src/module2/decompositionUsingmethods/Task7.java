package module2.decompositionUsingmethods;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        System.out.println("The sum of factorials odd numbers are " + getSumFactorialOddNumbers(array));

    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSumFactorialOddNumbers(int[] array) {
        int rez = 0;
        for (int i = 0; i < array.length; i++) {
            rez = getSum(array);
            rez += getFactorialOddNumbers(array);
        }
        return rez;
    }

    public static int getFactorialOddNumbers(int[] array) {
        int factorial = 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                factorial *= array[i];
            }
        }
        return factorial;
    }
}
