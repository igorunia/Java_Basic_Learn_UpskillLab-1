//Даны три точки A(x1,y1), B(x2,y2),C(x3,y3). Определить будут ли они на одной прямой.

package module1.branchig;

public class task3 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        int x3 = 1;
        int y3 = 1;
        boolean line = (x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2);
        if (line) {
            System.out.println("Dots are placed on one line!");
        } else {
            System.out.println("Dots aren't placed on one line!");
        }
    }

}
