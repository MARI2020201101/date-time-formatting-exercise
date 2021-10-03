package exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise5 {

    public static void main(String[] args) throws ParseException {
        System.out.println(getDayDiff2("20010103","20010101"));
        System.out.println(getDayDiff2("20010103","20010103"));
        System.out.println(getDayDiff2("20010103","200103"));
    }

    static int getDayDiff(String yyyyMMdd, String yyyyMMdd2) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date from = null;
        Date to =null;
        try {
            from = df.parse(yyyyMMdd);
            to = df.parse(yyyyMMdd2);
        } catch (ParseException e) {
            return 0;
        }

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(from);
        cal2.setTime(to);
        long diff = (cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
        return (int) (diff/(60*60*24));
    }

    static int getDayDiff2(String yyyyMMdd, String yyyyMMdd2) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date from = null;
        Date to =null;
        try {
            from = df.parse(yyyyMMdd);
            to = df.parse(yyyyMMdd2);
        } catch (ParseException e) {
            return 0;
        }

        long diff = (from.getTime()-to.getTime())/1000;
        return (int) (diff/(60*60*24));
    }
}
