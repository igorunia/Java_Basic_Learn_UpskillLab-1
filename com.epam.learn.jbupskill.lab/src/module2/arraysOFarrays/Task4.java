package module2.arraysOFarrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {
    public static void main(String[] args) {
        int lengthMatrixn = 6;
        int[][] squareMatrix = new int[lengthMatrixn][lengthMatrixn];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                if (i % 2 == 0) {
                    squareMatrix[i][j] = j + 1;
                }
                if (i % 2 != 0) {
                    squareMatrix[i][j] = (squareMatrix.length - 1 + 1) - j;
                }
                System.out.print(" " + squareMatrix[i][j]);
            }
            System.out.println();
        }
    }
}