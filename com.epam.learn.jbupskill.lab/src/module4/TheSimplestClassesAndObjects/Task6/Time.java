package module4.TheSimplestClassesAndObjects.Task6;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда) с
 * проверкой допустимости вводимых значений. В случае недопустимых значений полей
 * поле устанавливается в значение 0. Создать методы изменения времени на задан-
 * ное количество часов, минут и секунд.
 */
public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void changeHour(int hour) {
        this.hour = (this.hour + hour) % 24;
        if (this.hour < 0) {
            this.hour += 24;
        }
    }
    public void changeMinute(int minute) {
        if ((this.minute + minute) < 0) {
            changeHour(minute / 60 - 1);
            this.minute = 60 + ((this.minute + minute) % 60);
        } else {
            changeHour((this.minute + minute) / 60);
            this.minute = (this.minute + minute) % 60;
        }
    }

    public void changeSecond(int second) {
        if ((this.second + second) < 0) {
            changeMinute(second / 60 - 1);
            this.second = 60 + ((this.second + second) % 60);
        } else {
            changeMinute((this.second + second) / 60);
            this.second = (this.second + second) % 60;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getTime() {
        return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
    }

}
