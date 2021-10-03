package exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Calendar.*;

public class Exercise4 {

    static void answer() throws ParseException {
        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일 입니다.";

        DateFormat df = new SimpleDateFormat(pattern);
        DateFormat df2 = new SimpleDateFormat(pattern2);

        Scanner s = new Scanner(System.in);
        Date inDate = null;

        do{
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
            System.out.print(">>");
            String input = s.nextLine();
            inDate=df.parse(input);
            System.out.println(df2.format(inDate));
        }while(true);
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        while(true){
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
            System.out.print(">>");
            String input = scanner.nextLine();
            String pattern ="(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])";

            if(!Pattern.matches(pattern, input)){
                continue;
            }
            else{
                Calendar cal = getInstance();
                String[] inputs = input.split("/");
                int year = Integer.parseInt(inputs[0]);
                int month = Integer.parseInt(inputs[1])-1;
                int day = Integer.parseInt(inputs[2]);
                cal.set(year,month,day);
                System.out.println(days[cal.get(DAY_OF_WEEK)]);
                break;
            }
        }

        answer();
    }
}
