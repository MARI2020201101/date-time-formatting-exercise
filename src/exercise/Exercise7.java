package exercise;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Exercise7 {

    static void answer(){
        LocalDate date = LocalDate.of(2016,12,1);
        System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
    }
    public static void main(String[] args) {
        int[] plusDay = {0,22,21,27,26,25,24,23};
        LocalDate date = LocalDate.of(2016,12,1);
        LocalDate answer = date.plusDays(plusDay[date.getDayOfWeek().getValue()]);
        System.out.println(answer);
        answer();
    }
}
