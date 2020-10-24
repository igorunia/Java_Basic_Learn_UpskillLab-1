package module2.onedimensionalArrays;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static void main(String[] args) {
        int[] naturalsNumbers = new int[]{1, 12, 2, 1};
        int k = 2;
        int sumOfmultiple = 0;
        for (int i = 0; i < naturalsNumbers.length; i++) {
            if (naturalsNumbers[i] % k == 0) {
                sumOfmultiple += naturalsNumbers[i];
            }
        }
        System.out.println("The sum of multiples numbers: " + sumOfmultiple);
    }
}
