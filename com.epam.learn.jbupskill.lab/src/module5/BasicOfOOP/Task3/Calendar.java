package module5.BasicOfOOP.Task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private int year;
    private List<Holiday> holidays;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void addWeekend() {
        LocalDate date = LocalDate.of(year, 1, 1);
        while (date.getDayOfWeek() != DayOfWeek.SUNDAY && date.getDayOfWeek() != DayOfWeek.SATURDAY){
            date =date.plusDays(1);
        }

    }

    public void addHoliday(LocalDate holidayDate, String nameOfHoliday){
        holidays.add(new Holiday(holidayDate,nameOfHoliday));

    }

    public void printHoliday(){
        for(Holiday holiday:holidays){
            System.out.println(holiday);
        }
    }
}
