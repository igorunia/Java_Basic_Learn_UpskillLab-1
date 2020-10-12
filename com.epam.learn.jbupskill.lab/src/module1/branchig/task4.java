//Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие.
package module1.branchig;

public class task4 {
    public static void main(String[] args) {
        int a = 5; // сторона прямоугольного отверстия A
        int b = 6; // сторона прямоугольного отверстия B
        int x = 6; // размеры кирпича
        int y = 6; // размеры кирпича
        int z = 6; // размеры кирпича

        if (x <= a && y <= b || y <= a && x <= b || y <= a && z <= b || z <= a && y <= b || z <= a && x <= b
                || x <= a && z <= b) {
            System.out.println("A brick will go through the hole!");
        } else {
            System.out.println("A brick will get stuck!");
        }
    }
}
