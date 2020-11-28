package module2.decompositionUsingmethods;

/**
 * The method which get NOD of numbers
 */
public class MathUtilits {
    public static int getNod(int a, int b) {
        int result = 0;
        if (a == b) {
            result = a;
        }
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
    }
}
