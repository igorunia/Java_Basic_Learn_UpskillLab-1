package module2.arraysOFarrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {

        int[][] squareMatrix = new int[][]{
                {1, 2, 7},
                {3, 4, 7},
                {5, 6, 7}};

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {

                if (squareMatrix[i] == squareMatrix[j]) {

                    System.out.print(" " + squareMatrix[i][j]);
                }

                if (squareMatrix[i] == squareMatrix[squareMatrix.length - 1 - j]) {
                    System.out.print(" " + squareMatrix[i][j]);
                }

            }
            System.out.println();
        }
    }

}



