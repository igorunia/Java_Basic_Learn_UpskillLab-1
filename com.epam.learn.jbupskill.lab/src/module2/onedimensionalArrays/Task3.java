package module2.onedimensionalArrays;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {
    public static void main(String[] args) {
        double[] realOFNumbers = new double[]{1, 0, -2, 2, 0, 1, -1};
        int countNull = 0;
        int countPozitive = 0;
        int countNegative = 0;
        for (int i = 0; i < realOFNumbers.length; i++) {
            if (realOFNumbers[i] < 0) {
                countNegative++;
            }
            if (realOFNumbers[i] > 0) {
                countPozitive++;
            }
            if (realOFNumbers[i] == 0) {
                countNull++;
            }
        }
        System.out.println("The null of numbers: " + countNull);
        System.out.println("The pozitive of numbers: " + countPozitive);
        System.out.println("The negative of numbers: " + countNegative);

    }
}



