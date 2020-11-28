package module2.decompositionUsingmethods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        int c = 24;
        int d = 16;
        System.out.println("NOD = " + getNod(a, b, c, d));
    }

    public static int getNod(int a, int b, int c, int d) {
        int result = 0;
        int result1 = 0;
        int result2 = 0;
        while (a != b) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            } else {
                a = a - b;
            }
            result1 = a;
        }
        while (c != d) {
            if (c < d) {
                int temp = c;
                c = d;
                d = temp;
            } else {
                c = c - d;
            }
            result2 = c;
        }

        while (result1 != result2) {
            if (result1 < result2) {
                int temp = result1;
                result1 = result2;
                result2 = temp;
            } else {
                result1 = result1 - result2;

            }
            result = result1;
        }
        return result;
    }
}
