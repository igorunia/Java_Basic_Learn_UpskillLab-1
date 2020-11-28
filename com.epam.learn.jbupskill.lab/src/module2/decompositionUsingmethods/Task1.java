package module2.decompositionUsingmethods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел:(НОК A.B ,A.B/НОД(A.B)
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 14;
        int b = 21;
        System.out.println("NOD = " + MathUtilits.getNod(a, b));
        System.out.println("NOK = " + getNok(a, b));
    }

    public static int getNok(int a, int b) {
        return a * b / MathUtilits.getNod(a, b);
    }
    /*public static int getNod(int a, int b) {
        int result = 0;
        while (a != b) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            } else {
                a = a - b;
            }
            result = a;
        }
        return result;
    }*/
}


