package _8Date_and_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class _3Local_Date_Time_class {
    public static void main(String args[]){

        //now();
        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println(datetime1);

        //of();
        System.out.println(LocalDateTime.of(2024,01,27,13,40));
        System.out.println(LocalDateTime.of(2024, Month.FEBRUARY,27,14,15));

        //String to LocalDateTime
        String s1 = "2024-01-27T13:47";
        LocalDateTime datetime2 = LocalDateTime.parse(s1);
        System.out.println(datetime2);

        //LocalDatetime to String
        System.out.println(datetime1.format(DateTimeFormatter.ISO_DATE_TIME));

        //plusDays
        System.out.println(datetime1.plusDays(5));


        System.out.println(datetime1.getMonth());


        //get(temporal)
        //ChronoLocalField - class
        LocalDateTime a1 = LocalDateTime.of(2024,01,27,14,33);
        System.out.println(a1.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a1.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a1.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a1.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a1.get(ChronoField.MINUTE_OF_DAY));







    }
}
