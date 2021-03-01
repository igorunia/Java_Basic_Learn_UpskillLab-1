package module4.TheSimplestClassesAndObjects.Task7;

import static module4.TheSimplestClassesAndObjects.Task7.Triangle.createTriangle;

public class Runner {
    public static void main(String[] args) {

        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        Point c = new Point(2, 1);
        System.out.println("The triangle vertices: " + a.getX() + "," + a.getY() + "; " + b.getX() + "," + b.getY() + "; "
                + c.getX() + "," + c.getY());
        System.out.println("--------------------------------");

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle:" + perimeter);
        System.out.println("------------------------------------");

        double square = triangle.calculateSquare();
        System.out.println("Square of a triangle: " + square);
        System.out.println("-----------------------------------------");

        Point o = triangle.pointMedianIntersection();
        System.out.println("Median intersection point: " + o.getX() + "," + o.getY());
    }
}
