package module2.decompositionUsingmethods;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The sum of factorials odd numbers are " + getSumfactorialoddNumbers(array));

    }

    public static int getSumfactorialoddNumbers(int[] array) {
        int sumFactorial = 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                sumFactorial *= array[i];
            }
        }
        return sumFactorial;
    }
}
