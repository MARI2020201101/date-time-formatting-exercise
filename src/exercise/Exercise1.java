package exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(int i =0; i<12;i++){
            cal.set(2010,i,1);
            int firstday = cal.get(Calendar.DAY_OF_WEEK);

            cal.set(2010,i,firstday==1? 8:(16-firstday));
            System.out.println(sdf.format(cal.getTime()));
        }

    }
}
