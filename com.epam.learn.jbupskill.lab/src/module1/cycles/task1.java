package module1.cycles;

import java.util.Scanner;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

public class task1 {
    public static void main(String[] args) {
        boolean success = false;
        do {
            System.out.println("Enter any integer positive number:");
            Scanner number = new Scanner(System.in);
            int number1;
            int number2 = number.nextInt();
            int sum = 0;
            if (number2 > 0) {
                for (number1 = 1; number1 <= number2 && !success; number1++)
                    sum = sum + number1;
                System.out.println("Sum of all numbers " + sum);
                success = true;
                //break;
            } else {
                System.out.println("Enter other number");
            }
        } while (!success);
    }

}
