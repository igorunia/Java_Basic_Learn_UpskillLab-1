package module1.cycles;

import java.math.*;
//Составить программу нахождения произведения квадратов первых двухсот чисел

public class task4 {
    public static void main(String[] args) {
        BigInteger sumProduct = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            sumProduct = sumProduct.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Sum product of number = " + sumProduct);
    }
}
