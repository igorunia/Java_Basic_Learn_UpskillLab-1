package module2.decompositionUsingmethods;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double z = 7;
        double t = 8;

        System.out.println("The area of quadrangle = " + getSquadrangle(x, y, z, t));

    }

    public static double getSstrictTriangle(double x, double y) {
        return (x * y) / 2;
    }

    public static double getStriangle(double x, double y, double z, double t) {
        double diagonal = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        double p = (z + t + diagonal) / 2;
        return Math.sqrt(p * (p - z) * (p - t) * (p - diagonal));
    }

    public static double getSquadrangle(double x, double y, double z, double t) {
        return getSstrictTriangle(x, y) + getStriangle(x, y, z, t);

    }

}
