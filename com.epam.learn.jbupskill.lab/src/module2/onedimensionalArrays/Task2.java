package module2.onedimensionalArrays;
//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчи­тать количество замен.

public class Task2 {
    public static void main(String[] args) {
        double[] realOfnumbers = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double numberZ = 6;
        int count = 0;
        for (int i = 0; i < realOfnumbers.length; i++) {
            if (realOfnumbers[i] > numberZ) {
                realOfnumbers[i] = numberZ;
                count++;

            }
        }
        System.out.println(count);
    }
}
