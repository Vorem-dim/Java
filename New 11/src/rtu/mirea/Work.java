package rtu.mirea;

import java.util.*;
import java.text.*;

public class Work {
    Date date;
    String surname;
    Calendar calendar;

    public Work(String surname) {
        this.surname = surname;
        date = new Date();
    }

    public Work(String surname, long date) {
        this.surname = surname;
        this.date = new Date(date);
    }

    public Work(String surname, int year, int month, int day, int hour, int minute, int second) {
        this.surname = surname;
        calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year - 1);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
    }

    public int Compare() {
        return (new Date()).compareTo(date);
    }

    public String get_calendar() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        return sdf.format(calendar.getTime());
    }

    @Override
    public String toString() {
        return "Surname - " + surname + ": " + date;
    }
}
