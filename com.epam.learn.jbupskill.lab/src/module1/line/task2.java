//Вычислить значение выражения по формуле (все переменные принимают действительное значение): ((b+√b²+4ac)/2a)-a³c+b²
package module1.line;

public class task2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double rez;

        a = 2.0;
        b = 2.0;
        c = 2.0;

        rez = (b + Math.sqrt((b * b + 4 * a * c))) / (2 * a) + Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("rez = " + rez);

    }
}
