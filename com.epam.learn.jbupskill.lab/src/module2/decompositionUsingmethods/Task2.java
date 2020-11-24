package module2.decompositionUsingmethods;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {
    public static void main(String[] args) {
        int nod = 0;
        int a = 12;
        int b = 30;
        int c = 24;
        int d = 16;

        nod = getNod(nod, a, b);
        nod = getNod(nod, c, d);
        nod = getNod(nod, a, c);
        outPut(nod);
    }
    private static void outPut(int nod) {
        System.out.println(nod);
    }
    private static int getNod(int nod, int a, int b) {
        while (a != b) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            } else {
                a = a - b;
            }
            nod = a;
        }
        return nod;
    }
}
