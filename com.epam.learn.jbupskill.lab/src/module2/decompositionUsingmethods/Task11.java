package module2.decompositionUsingmethods;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int a = 129;
        int b = 6789;

        getNumberbiger(a, b);

    }

    public static int getCountnumber1(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static int getCountnumber2(int b) {
        int count = 0;
        while (b != 0) {
            count++;
            b /= 10;
        }
        return count;
    }

    public static void getNumberbiger(int a, int b) {
        if (getCountnumber1(a) > getCountnumber2(b)) {
            System.out.println("The number A has  more numerals ");
        } else {
            System.out.println("The number B has  more numerals ");
        }
    }
}
