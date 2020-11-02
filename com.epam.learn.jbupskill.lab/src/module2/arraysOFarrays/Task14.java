package module2.arraysOFarrays;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        int lengthLines = 5;
        int lengthColumns = 6;
        int[][] squareMatrix = new int[lengthLines][lengthColumns];

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                int randomNumbers = (int) (Math.random()*2);
                squareMatrix[i][j] = randomNumbers;
                System.out.print(" " + squareMatrix[i][j]);

            }
            System.out.println();
        }
    }
}

