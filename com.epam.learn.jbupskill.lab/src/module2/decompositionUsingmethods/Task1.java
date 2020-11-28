package module2.decompositionUsingmethods;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
// общего кратного двух натуральных чисел:(НОК A.B ,A.B/НОД(A.B)

public class Task1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        int NOK =   0;
        int NOD = 0;
        NOD = getNod(a, b, NOD);
        output(NOD);
        NOK = getNok(a, b, NOD);
        output(NOK);
    }
    private static int getNok(int a, int b, int NOD) {
        int NOK;
        NOK = a * b / getNod(a, b, NOD);
        return NOK;
    }
    private static void output(int NOD) {
        System.out.println(NOD);
    }
    private static int getNod(int a, int b, int NOD) {
        while (a != b) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            } else {
                a = a - b;
            }
            NOD = a;
        }
        return NOD;
    }
}


