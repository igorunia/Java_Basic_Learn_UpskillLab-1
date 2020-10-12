//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях. Поменять местами дробную и целую части числа и вывести полученное значение числа.
package module1.line;

public class task4 {
    public static void main(String[] args) {
        double numberR = 123.321;
        double rez = numberR * 1000 % 1000 + (int) numberR / 1000.0;

        System.out.println("rez = " + rez);
    }
}
