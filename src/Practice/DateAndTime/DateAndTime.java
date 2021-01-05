package Practice.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {
    public static void main(String[] args) {

//Date and Time is completely revamped in Java 8

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // now() is a static method

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        // Month is a special type of class called enum.

        LocalTime time1 = LocalTime.of(6, 15);
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        System.out.println(time2);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
        System.out.println(time3);


        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1);

        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        //LocalDate d = new LocalDate();
        // LocalDate() has aprivate constructor, we cannot create them like an object!!!

       /*
        LocalDate date3 = LocalDate.of(2015, Month.JANUARY,32);
        System.out.println(date3);

        Exception in thread "main" java.time.DateTimeException:
        Invalid value for DayOfMonth (valid values 1 - 28/31): 32

        32 is not a vlid day for a month!!!!!!!

        */

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);

        date = date.plusDays(2);
        System.out.println(date);

        date = date.plusWeeks(1);
        System.out.println(date);

        date = date.plusMonths(1);
        System.out.println(date);

        date = date.plusYears(5);
        System.out.println(date);

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time4 = LocalTime.of(5, 15);

        LocalDateTime dateTime3 = LocalDateTime.of(date3, time4);

        System.out.println(dateTime3);

        dateTime3 = dateTime3.minusDays(1);
        System.out.println(dateTime3);

        dateTime3 = dateTime3.minusHours(10);
        System.out.println(dateTime3);

        dateTime3 = dateTime3.minusSeconds(30);
        System.out.println(dateTime3);

        LocalDateTime dateTime4 = LocalDateTime.of(date3, time4);

        dateTime4 = dateTime4.minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime4);

        dateTime4.plusDays(10); // this does nothing, date and time is immutable, they need to be assigned to a variable!!!
        System.out.println(dateTime4);

        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
      //  date4 = date4.plusMinutes(1);
      // We cannot add minutes to date!!!!!

      LocalDate start = LocalDate.of(2015,Month.JANUARY,1);
      LocalDate end = LocalDate.of(2015,Month.MARCH, 30);
      Period period = Period.ofMonths(1);
      performAnimalEnrichment(start,end,period);

      Period annually = Period.ofYears(1);
      Period quarterly = Period.ofMonths(3);
      Period everyThreeWeeks = Period.ofWeeks(3);
      Period everyOtherDay = Period.ofDays(2);
      Period everyYearAndWeek = Period.of(1,0,7);


      // We can cot chain the Period() method because it is static;

        Period wrong = Period.ofYears(1).ofWeeks(1);

        System.out.println(dateTime4);
        dateTime4 = dateTime4.plus(wrong);
        System.out.println(dateTime4);
// Here only .ofWeeks(1) is added, we cannot chain Period(), last method is used only, .ofYears(1) is ignored!!!1

        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(2);

        dateTime4 = dateTime4.plus(wrong2);

        System.out.println(dateTime4);

        //Since Period is also static, the last value was 2 weeks, so it adds two weeks to dateTime4!!!

        LocalDate date5 = LocalDate.of(2015,1,20);
        LocalTime time5  = LocalTime.of(6,15);

        LocalDateTime dateTime5 = LocalDateTime.of(date5, time5);

        Period period2 = Period.ofMonths(1);
        System.out.println(date5.plus(period2));
        System.out.println(dateTime5.plus(period2));
        //System.out.println(time5.plus(period2));  will give UnsupportedTemporalTypeException: Unsupported unit: Months
        //  cannot add months to time!!!

        LocalDate date6 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date6.getDayOfWeek());
        System.out.println(date5.getMonth());
        System.out.println(date6.getYear());
        System.out.println(date6.getDayOfYear());

        LocalTime time6 = LocalTime.of(11,12,34);

        LocalDateTime dateTime6 = LocalDateTime.of(date6,time6);
        System.out.println(date6.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time6.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime6.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(dateTime6));
        System.out.println(shortDateTime.format(date6));
       // System.out.println(shortDateTime.format(time6));
        // UnsupportedTemporalTypeException: Unsupported field: MonthOfYear
        // Time cannot be formatted as a date!!!!

        // We can also wrothe previous code like this

        System.out.println(dateTime6.format(shortDateTime));
        System.out.println(date6.format(shortDateTime));
       // System.out.println(time6.format(shortDateTime));  STILL gives the error!!!

        // We can see two different formats in the test
        // SHORT and MEDIUM

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortF.format(dateTime6));
        System.out.println(mediumF.format(dateTime6));



        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(dateTime6.format(f));

        LocalDate date7 = LocalDate.parse("01 02 2015",f);
        LocalTime time7 = LocalTime.parse("11:22");
        System.out.println(date7);
        System.out.println(time7);



        /*
        MMMM full month
        MMM three letter
        MM two numbers
        M one number

        yyyy four number year
        yy two number year

        hh two digit hour
        h one digit hour

        a makes AM PM


         */





    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;

        while(upTo.isBefore(end)){

            System.out.println("give new toy:"+upTo);
            upTo=upTo.plus(period);
        }

    }


}
