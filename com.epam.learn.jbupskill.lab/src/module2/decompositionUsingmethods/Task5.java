package module2.decompositionUsingmethods;

//Составить программу, которая в массиве A[N] находит второе по величине
// число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class Task5 {
    public static void main(String[] args) {
        double[] array = new double[]{0, 5, 1, 4, 3, 2};
        for (int i = 0; i < array.length-2; i += 2) {
            System.out.print(array[i]);
            System.out.println(array[i+1]);

            for (int j = i+2; j < array.length; j++) {


            }
        }
    }
}
