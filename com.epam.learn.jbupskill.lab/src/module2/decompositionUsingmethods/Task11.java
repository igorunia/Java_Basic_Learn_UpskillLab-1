package module2.decompositionUsingmethods;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int a = 129;
        int b = 6789;

        getNumberBiger(a, b);

    }

    public static int getCountNumber(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }


    public static boolean getNumberBiger(int a, int b) {
        if (getCountNumber(a) > getCountNumber(b)) {
            System.out.println("The number A has  more numerals ");
        } else {
            System.out.println("The number B has  more numerals ");
        }
        return false;
    }
}
