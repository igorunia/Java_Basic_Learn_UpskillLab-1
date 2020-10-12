//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

package module1.cycles;

public class task5 {
    public static void main(String[] args) {
        int symbol = 127;
        int rez = 0;

        for (int i = 1; i <= symbol; i++) {
            rez = i;
            System.out.println(rez + " " + (char) rez);
        }
    }
}
