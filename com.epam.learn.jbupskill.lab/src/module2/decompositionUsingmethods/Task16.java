package module2.decompositionUsingmethods;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(sum(n));

    }

    public static int sum(int n) {
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           if(oddNumber(n))
            sum += array[i];
        }
        return sum;
    }

    public static boolean oddNumber(int n) {
        int[] array = new int[n];
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
            }

        }
        return false;
    }

    public static int countEvenSumNumber(int n) {
        int rez = 0;
        int countEven = 0;
        int count = 0;
        while (sum(n) != 0) {
            if ((sum(n) % 10) % 2 == 0) {
                countEven++;
            }
            rez = sum(n) / 10;
            count++;

        }
        return rez;
    }
}
