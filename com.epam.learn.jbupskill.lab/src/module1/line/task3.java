//Вычислить значение выражения по формуле (все переменные принимают действительное значение): sinx+cosy/cosx-siny*tgxy.
package module1.line;

public class task3 {
    public static void main(String[] args) {

        double x = 2;
        double y = 1;
        double rez = ((Math.sin(x) + Math.cos(y)) /(Math.cos(x) - Math.sin(y)))* Math.tan(x * y);

        System.out.println("rez = " + rez);
    }
}
