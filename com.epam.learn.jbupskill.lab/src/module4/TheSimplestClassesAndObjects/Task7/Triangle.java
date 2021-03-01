package module4.TheSimplestClassesAndObjects.Task7;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private final Side a;
    private final Side b;
    private final Side c;

    public Triangle(Side a, Side b, Side c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle createTriangle(Point a, Point b, Point c) {
        Side sideA = new Side(a, b);
        Side sideB = new Side(b, c);
        Side sideC = new Side(a, c);
        return new Triangle(sideA, sideB, sideC);
    }

    public Side getA() {
        return a;
    }

    public Side getB() {
        return b;
    }

    public Side getC() {
        return c;
    }

    public double calculatePerimeter() {
        return a.calculateSide() + b.calculateSide() + c.calculateSide();
    }

    public double calculateSquare() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a.calculateSide()) * (p - b.calculateSide()) * (p - c.calculateSide()));
    }

    public Point pointMedianIntersection() {
        double x = (a.getA().getX() + a.getB().getX() + b.getB().getX()) / 3;
        double y = (a.getA().getY() + a.getB().getY() + b.getB().getY()) / 3;
        return new Point(x, y);
    }

}
