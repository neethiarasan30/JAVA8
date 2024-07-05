package _8Date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _1Local_Date_class {
    public static void main(String args[]){
        //-----------LocalDate  class -- Final class

        //date
        LocalDate date1 = LocalDate.now();
        LocalDate yesterday = date1.minusDays(1);
        LocalDate tomorrow = date1.plusDays(1);

        System.out.println(date1);
        System.out.println(yesterday);
        System.out.println(tomorrow);


        //to find leap year or not
        System.out.println(date1.isLeapYear());

        LocalDate date2 = LocalDate.of(2001,07,30);
        System.out.println(date2.isLeapYear());

        LocalDate date3 = LocalDate.of(2024,01,27);
        System.out.println(date3.isLeapYear());


        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date2.getDayOfYear());

        System.out.println(date1.atTime(01,15));

        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getYear());

        System.out.println(date1.lengthOfMonth());

        System.out.println(date1.compareTo(date2));
        System.out.println(yesterday.equals(tomorrow));

        //converting String to LocalDate  -- parse
        String  d1 = "2001-07-30";
        System.out.println(d1);
        LocalDate date4 = LocalDate.parse(d1);
        System.out.println(date4);

        //converting LocalDate to String
        LocalDate d2 = LocalDate.now();
        String d3 = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date in String "+ d3);

        //converting LocalTime to String
        LocalTime d4 = LocalTime.now();
        String d5 = d4.format(DateTimeFormatter.ISO_TIME);
        System.out.println("Time in String " +d5);


    }
}
