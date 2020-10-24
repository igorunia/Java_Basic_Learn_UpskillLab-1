package module2.onedimensionalArrays;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task6 {
    public static void main(String[] args) {

        double[] realNumbers = new double[]{1, 2.3, 4, 6,7};
        int sumSimplenumbers = 0;
        for (int i = 0; i < realNumbers.length; i++) {

            if (i % 2 == 0) {
                sumSimplenumbers += realNumbers[i];
            }
        }
        System.out.println(sumSimplenumbers);
    }
}
