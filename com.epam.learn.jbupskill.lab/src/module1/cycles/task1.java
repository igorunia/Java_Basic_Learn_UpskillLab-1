package module1.cycles;

import java.util.Scanner;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

public class task1 {
    public static void main(String[] args) {
        boolean success = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter any integer positive number:");
            int number = scanner.nextInt();
            if (number > 0) {
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum of all numbers " + sum);
                success = true;
            } else {
                System.out.println("Enter other number");
            }
        } while (!success);
    }

}
