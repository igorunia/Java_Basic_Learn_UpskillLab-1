//Вычислить значение функции: x2-3x + 9, если x<=3; 1/x3 + 6, если x>3
package module1.branchig;

public class task5 {
    public static void main(String[] args) {
        int x = 4;
        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println((1 / Math.pow(x, 3)) + 6);
        }
    }
}
