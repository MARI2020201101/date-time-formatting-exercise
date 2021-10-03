package exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise6 {

    static void answer(){
        LocalDate birthday = LocalDate.of(2000,1,1);
        LocalDate now = LocalDate.now();
        long days = birthday.until(now, ChronoUnit.DAYS);
        System.out.println(days);
    }

    public static void main(String[] args) {
        String birth = "2000-01-01";
        String today = "2016-01-29";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date from = null;
        Date to = null;
        try {
            from= df.parse(birth);
            to = df.parse(today);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = (to.getTime() - from.getTime())/(1000*60*60*24);
        System.out.println(diff);

        answer();
    }
}
