//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

package module1.cycles;

public class task7 {
    public static void main(String[] args) {
        int number = 1231;
        int number2 = 13;
        while (number2 != 0) {
            int dNnumber2 = number2 % 10;
            number2 = number2 / 10;
            int tmp = number;
            while (tmp != 0) {
                int d = tmp % 10;
                tmp = tmp / 10;
                if (dNnumber2 == d) {
                    System.out.println(dNnumber2);
                }
            }
        }
        while (number != 0) {
            int dNnumber = number % 10;
            number = number / 10;
            int tmp1 = number2;
            while (tmp1 != 0) {
                int d1 = tmp1 % 10;
                tmp1 = tmp1 / 10;
                if (dNnumber == d1) {
                    System.out.println(dNnumber);
                }
            }
        }

    }
}
