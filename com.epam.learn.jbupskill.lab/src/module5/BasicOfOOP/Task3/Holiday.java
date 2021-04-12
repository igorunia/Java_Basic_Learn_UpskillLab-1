package module5.BasicOfOOP.Task3;

import java.time.LocalDate;

public class Holiday {
    private LocalDate holidayDate;
    private String nameOfHoliday;

    public Holiday(LocalDate holidayDate, String nameOfHoliday) {
        this.holidayDate = holidayDate;
        this.nameOfHoliday = nameOfHoliday;
    }

    public LocalDate getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getNameOfHoliday() {
        return nameOfHoliday;
    }

    public void setNameOfHoliday(String nameOfHoliday) {
        this.nameOfHoliday = nameOfHoliday;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "holidayDate=" + holidayDate +
                ", nameOfHoliday='" + nameOfHoliday + '\'' +
                '}';
    }
}
