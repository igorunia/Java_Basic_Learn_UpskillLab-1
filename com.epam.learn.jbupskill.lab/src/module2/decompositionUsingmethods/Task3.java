package module2.decompositionUsingmethods;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public static void main(String[] args) {

        double a = 6;

        double trigleS = getS(a);
        double sixtrigleS = 6 * getS(a);
        outPut(sixtrigleS);
    }
    private static void outPut(double sixtrigleS) {
        System.out.println(sixtrigleS);
    }
    private static double getS(double a) {
        return ((3 * Math.sqrt(a)) / 2) * Math.pow(a, 2);
    }
}
