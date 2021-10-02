package exercise;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.regex.Matcher;

public class Exercise3 {

    static void answer(String data) throws ParseException {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,####");

        Number num = df.parse(data);
        double d = num.doubleValue();
        System.out.println();
        System.out.println("data : " + d);
        System.out.println("반올림 : "+ Math.round(d));
        System.out.println("만단위 : "+ df2.format(d));

    }

    public static void main(String[] args) throws ParseException {
        String data = "123,456,789.5";
        String newData = data.replace(",","");
        String newData2 = newData.replace(".","");

        int val = Integer.parseInt(newData2);
        int rounds = ((val+5)/10);

        System.out.println("data: " + newData);
        System.out.println("반올림 : " + rounds);
        DecimalFormat df = new DecimalFormat("####,####");
        System.out.println("만단위: " + df.format(rounds));

        answer(data);
    }
}
