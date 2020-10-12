//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
package module1.line;

public class task5 {
    public static void main(String[] args) {

        int durationOfpastTimesec = 5184;
        int durationOfpastTimehour = durationOfpastTimesec / 3600;
        int durationOfpastTimehour1 = durationOfpastTimesec - (durationOfpastTimehour * 3600);
        int min = durationOfpastTimehour1 / 60;
        int sec = durationOfpastTimehour1 - (min * 60);

        System.out.println(durationOfpastTimehour + "ч" + " " + min + "мин" + " " + sec + "c");

    }
}
