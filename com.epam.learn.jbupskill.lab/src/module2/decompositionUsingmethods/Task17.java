package module2.decompositionUsingmethods;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        int a = 28;
        subtractionSumOfNumber(a);


    }

    public static int sum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }
        return sum;
    }

    public static int subtractionSumOfNumber(int a) {
        int rez = a;
        int count = 0;
        while (rez > 0) {

            rez = rez - sum(a);
            count++;

        }
        System.out.println(count);
        return rez;
    }
}
