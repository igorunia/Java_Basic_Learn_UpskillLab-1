package module2.decompositionUsingmethods;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {
        int k = 1000;
        getAmrstrongNumbers(k);

    }

    public static void getAmrstrongNumbers(int k) {

        for (int i = 0; i <= k; i++) {
            int firstDigit = (i / 100);
            int secondDigit = (i % 100) / 10;
            int thirdDigit = (i % 10);

            if ((firstDigit * firstDigit * firstDigit)
                    + (secondDigit * secondDigit * secondDigit)
                    + (thirdDigit * thirdDigit * thirdDigit) == i) {

                System.out.println("this is a armstrong number - " + i);
            }
        }

    }
}

