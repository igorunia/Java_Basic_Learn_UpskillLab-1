package module2.decompositionUsingmethods;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине
 * число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 7, 7, 8, 9, 9};
        System.out.println("The maximum number in massive is " + getMaxnumber(array));
        System.out.println("The second maximum number in massive is " + getTwomaxNumber(array));
    }

    public static int getMaxnumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int getTwomaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != getMaxnumber(array) && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}











