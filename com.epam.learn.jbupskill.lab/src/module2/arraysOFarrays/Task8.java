package module2.arraysOFarrays;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers defining the length of the array ");
        System.out.println("lengthlines: ");
        int lengthLines = scanner.nextInt();
        System.out.println("lengthColumns: ");
        int lengthColumns = scanner.nextInt();

        int[][] array = new int[lengthLines][lengthColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Insert numbers of columns which are necessary to change ");
        System.out.println("columnInsert: ");
        int columnInsert = scanner.nextInt();
        System.out.println("columnChange: ");
        int columnChange = scanner.nextInt();

        for (int i = 0; i < lengthLines; i++) {
            int tmp = array[i][columnInsert];
            array[i][columnInsert] = array[i][columnChange];
            array[i][columnChange] = tmp;//временный файл
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
