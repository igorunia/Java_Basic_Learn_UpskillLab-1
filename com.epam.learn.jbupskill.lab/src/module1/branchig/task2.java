//Найти max{min(a,b),min(c,d)}.
package module1.branchig;

public class task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 1;
        int d = 4;
        boolean min1 = a < b;
        boolean min2 = c < d;
        int maxmin1;
        int maxmin2;
        if (min1) {
            maxmin1 = a;
            System.out.println("Max min from a,b: " + maxmin1);
        } else {
            maxmin1 = b;
            System.out.println("Max min from a,b: " + maxmin1);
        }
        if (min2) {
            maxmin2 = c;
            System.out.println("Max min from c,d: " + maxmin2);
        } else {
            maxmin2 = d;
            System.out.println("Max min from c,d: " + maxmin2);
        }
        if (maxmin1 > maxmin2) {
            System.out.println("Max from min: " + maxmin1);
        } else {
            System.out.println("Max from min: " + maxmin2);
        }

    }
}
