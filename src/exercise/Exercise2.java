package exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import static java.util.Calendar.*;

public class Exercise2 {
    static int paycheckCount(Calendar from, Calendar to){
        if(Objects.isNull(from)|| Objects.isNull(to)) return 0;
        else if(from==to && from.get(DATE)==21) return 1;
        else {
            int monDiff = (to.get(YEAR)*12 + to.get(MONTH))-(from.get(YEAR)*12 + from.get(MONTH));
            if(monDiff<0) return 0;
            else if(from.get(DATE)<=21 && to.get(DATE)>=21){
                return ++monDiff;
            }else if(from.get(DATE)>21 && to.get(DATE)<21){
                return --monDiff;
            }return monDiff;
        }
    }

   static void printResult(Calendar from, Calendar to){
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : ");
       System.out.println(paycheckCount(from, to));
   }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2010,0,1);
        toCal.set(2010,0,1);
        printResult(fromCal,toCal);

        fromCal.set(2010,0,21);
        toCal.set(2010,0,21);
        printResult(fromCal,toCal);

        fromCal.set(2010,0,1);
        toCal.set(2010,2,1);
        printResult(fromCal,toCal);

        fromCal.set(2010,0,1);
        toCal.set(2010,2,23);
        printResult(fromCal,toCal);

        fromCal.set(2010,0,23);
        toCal.set(2010,2,21);
        printResult(fromCal,toCal);

        fromCal.set(2011,0,22);
        toCal.set(2010,2,21);
        printResult(fromCal,toCal);
    }
}
