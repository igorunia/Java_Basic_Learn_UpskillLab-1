package module2.decompositionUsingmethods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int c = 6;
        int d = 6;
        System.out.println("NOD = " + getNod(a, b, c, d));
    }

    public static int getNod(int a, int b, int c, int d) {
        int result = MathUtilits.getNod(a, b);
        int result1 = MathUtilits.getNod(c, d);
        return  MathUtilits.getNod(result, result1);
    }
}
