package module2.decompositionUsingmethods;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {

        int n = 20;
        System.out.print(getTwins(n));

    }

    public static int getTwins(int n) {
        int count = 0;
        for (int i = 0; i <= 2 * n; i += 2) {
            if (!((i - 1) < 0 || (i + 1) > 2 * n)) {
                count++;
                System.out.print((i - 1) + " " + (i + 1) + "; ");
            }
        }
        return count;
    }
}









