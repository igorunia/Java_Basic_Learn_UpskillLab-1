package module2.onedimensionalArrays;
//Даны действительные числа а1 ,а2 ,..., аn. Найти max a1 + a2n,a2+a2n-1...an+an+1

public class Task7 {
    public static void main(String[] args) {

        double[] realNumbers = new double[]{-1, -20, -3, -4, -5, -6, -8, -9};
        int n = realNumbers.length / 2;

        double max = realNumbers[0] + realNumbers[n];

        for (int i = 1; i < n; i++) {
            double sum = realNumbers[i] + realNumbers[i + n];
            if (sum > max) {
                max = sum;
                System.out.println(max);
            }
        }

        System.out.println("max " + max);
    }
}
