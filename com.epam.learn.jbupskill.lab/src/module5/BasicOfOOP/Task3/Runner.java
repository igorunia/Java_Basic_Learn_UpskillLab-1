package module5.BasicOfOOP.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях
 */
public class Runner {
    public static void main(String args[]){
        int year = 2021;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "New Year");
        calendar.addHoliday(LocalDate.parse("01.02." + year, dtf), "New Year2");


        calendar.printHoliday();

    }

}
