package module2.arraysOFarrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6 {
    public static void main(String[] args) {
        int lengthMatrixn = 6;

        int[][] squareMatrix = new int[lengthMatrixn][lengthMatrixn];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
            }
        }
        for (int i = 0; i < squareMatrix.length / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = i; j < squareMatrix.length / 2; j++) {
                squareMatrix[i][j] = 1;
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = squareMatrix.length / 2; j < squareMatrix.length - i; j++) {
                squareMatrix[i][j] = 1;
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = squareMatrix.length - i; j < squareMatrix.length; j++) {
                System.out.print(" " + squareMatrix[i][j]);
            }
            System.out.println();
        }
        for (int i = squareMatrix.length / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = i; j < squareMatrix.length / 2; j++) {
                squareMatrix[i][j] = 1;
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = squareMatrix.length / 2; j < squareMatrix.length - i; j++) {
                squareMatrix[i][j] = 1;
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = squareMatrix.length - i; j < squareMatrix.length; j++) {
                System.out.print(" " + squareMatrix[i][j]);
            }
            System.out.println();
        }
    }
}