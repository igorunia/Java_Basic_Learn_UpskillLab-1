package module2.decompositionUsingmethods;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class Task3 {
    public static void main(String[] args) {
        double sideA = 6;
        System.out.println("The square of equal triagle =  " + getSixtriagleS(sideA));
    }

    public static double getTriagleS(double sideA) {
        return ((3 * Math.sqrt(sideA)) / 2) * Math.pow(sideA, 2);
    }

    public static double getSixtriagleS(double sideA) {
        return 6 * getTriagleS(sideA);
    }
}