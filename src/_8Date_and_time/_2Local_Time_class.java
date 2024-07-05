package _8Date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _2Local_Time_class {
    public static void main(String args[]){
        //-----------LocalTime  class -- Final class
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.getNano());

        //String to LocalTime
        String s1 = "15:05";
        LocalTime time2 = LocalTime.parse(s1);
        System.out.println(time2);

        //LocalTime to String
        String s2 = time1.format(DateTimeFormatter.ISO_TIME);
        System.out.println(s2);

        //isBefore
        System.out.println(time1.isBefore(time2));

        //isAfter
        System.out.println(time1.isAfter(time2));

        //of
        LocalTime time3 = LocalTime.of(8,15);
        System.out.println(time3);

        //MAX
        LocalTime time4 = LocalTime.MAX;
        System.out.println(time4);

        //MIN
        LocalTime time5 = LocalTime.MIN;
        System.out.println(time5);

        //plushours
        System.out.println(time1.plusHours(5));

        //plusMinutes
        System.out.println(time1.plusMinutes(5));

        //plusSeconds
        System.out.println(time1.plusSeconds(5));


        //minusHours
        System.out.println(time1.minusHours(5));

        //minusMinutes
        System.out.println(time1.minusMinutes(5));

        //minusSeconds
        System.out.println(time1.minusSeconds(5));


        System.out.println(time1.withHour(12));
        System.out.println(time1.withMinute(01));
        System.out.println(time1.withSecond(59));

        //atDate
        LocalDate d1 = LocalDate.of(2001,07,30);
        System.out.println(time1.atDate(d1));



    }
}
