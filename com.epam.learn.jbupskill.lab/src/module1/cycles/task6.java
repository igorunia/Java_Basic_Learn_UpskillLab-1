package module1.cycles;

import java.util.Scanner;
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.package module1.cycles;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Enter any natural number m and n:");
        Scanner number = new Scanner(System.in);
        int m = number.nextInt();
        int n = number.nextInt();
        for (int i = m; i <= n; i++) {

            System.out.print(i + ": ");

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
