package exercise;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise8 {

    static void answer(){
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime LA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(tokyo);
        System.out.println(LA);

        long sec1 = tokyo.getOffset().getTotalSeconds();
        long sec2 = LA.getOffset().getTotalSeconds();

        long diff =sec1-sec2;
        System.out.println(diff);
        System.out.println(diff/(60*60));
    }

    public static void main(String[] args) {
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime LA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(tokyo);
        System.out.println(LA);
        System.out.println(tokyo.minusHours(LA.getHour()).getHour());

        answer();
    }
}
