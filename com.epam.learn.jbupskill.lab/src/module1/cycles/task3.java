//Найти сумму квадратов первых ста чисел

package module1.cycles;

public class task3 {
    public static void main(String[] args) {
        double sumPow = 0;
        for (double i = 1; i <= 100; i++) {
            double pow = Math.pow(i, 2);
            sumPow = sumPow + pow;
        }
        System.out.println("sumPow = " + sumPow);
    }
}
