package module2.arraysOFarrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {
    public static void main(String[] args) {

        int lengthMatrixn = 6;

        int[][] squareMatrix = new int[lengthMatrixn][lengthMatrixn];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length - i; j++) {
                squareMatrix[i][j] = i + 1;
                System.out.print(" " + squareMatrix[i][j]);
            }
            for (int j = squareMatrix[i].length - i; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = 0;
                System.out.print(" " + squareMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
