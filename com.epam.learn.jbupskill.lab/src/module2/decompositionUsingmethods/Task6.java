package module2.decompositionUsingmethods;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 2;
        getSimplenumber(a, b, c);
    }

    public static int getNod(int a, int b, int c) {
        int result = MathUtilits.getNod(a, b);
        return MathUtilits.getNod(result, c);

    }

    public static void getSimplenumber(int a, int b, int c) {
        if (getNod(a, b, c) == 1) {
            System.out.println("The numbers are simple!");
        } else {
            System.out.println("The numbers are't simple!");
        }

    }

}
