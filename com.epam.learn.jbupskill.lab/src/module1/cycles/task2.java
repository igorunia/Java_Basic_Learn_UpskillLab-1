//Вычислите значения функции на отрезке [a,b] с шагом h: y = x,x>2 -x,x<=2
package module1.cycles;

public class task2 {
    public static void main(String[] args) {
        double a = 0;
        double b = 4;
        double h = 0.5;
        double x = a;
        for (x = a; x <= b; x += h) {
            System.out.print("x = " + x + ", ");
            if (x > 2) {
                System.out.println("y = " + x);
            } else if (x <= 2) {
                System.out.println("y = " + -x);
            }
        }
    }
}
