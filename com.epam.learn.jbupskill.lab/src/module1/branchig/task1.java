//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямогульным.
package module1.branchig;

public class task1 {
    public static void main(String[] args) {
        int cornerA = 120;
        int cornerB = 80;
        boolean triangleExists = cornerA + cornerB < 180;
        System.out.println(triangleExists ? "There is triangle" : "It isn't a triangle");
        if (triangleExists) {
            System.out.println((cornerA == 90) || (cornerB == 90) || (cornerA + cornerB) == 90 ? "It is a right triangle"
                    : "It isn't a right triangle");
        }
    }

}
