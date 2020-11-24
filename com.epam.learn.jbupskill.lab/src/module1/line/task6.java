//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит
// закрашенной области, и false — в противном случае:
package module1.line;

public class task6 {
    public static void main(String[] args) {
        int x = 2;
        int y = -4;

        boolean condition1 = (x <= 2) && (x >= -2) && (y <= 4) && (y >= -3);
        boolean condition2 = (x <= 4) && (x >= -4) && (y >= -3) && (y <= 0);
        if (condition1 || condition2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
