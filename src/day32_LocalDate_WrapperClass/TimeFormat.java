package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    /*
    Methods we have learned:
    of
    now
    format
    isBefore
    isAfter
    plusday,month,year,hour,min


    Local Date
    year:yyyy
    month:MM(number), MMM(first three letters),MMMM(entire name of the month)
    days:dd

name of the day: E (prints three letters of the day) EEEE full day

hours: hh
minute:mm
second:ss
AM/PM : a

     */
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/yy, EEEE");

        LocalDate today = LocalDate.now();  //2020-11-23 , default format
        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        // Monday, 12:40 pm Nov/23/2020

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
        System.out.println(dt1.format(dtf));

        // task:
        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

        // verify is a day before another day

        boolean r1 = today.isBefore(tomorrow);

        boolean r2 = today.isAfter(tomorrow);

        System.out.println(r1);
        System.out.println(r2);

        // calculate age of a persson

        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000,5,19);

        int age = currentYear-DofB.getYear();

        System.out.println(age);

        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();

        LocalDate holidayBreak = rightNow.plusDays(2);

        System.out.println(holidayBreak);

    LocalTime time = LocalTime.now();
    LocalTime lunchbnreak = time.plusMinutes(15);

        System.out.println(lunchbnreak.format(tf));

        System.out.println("==========================");

        LocalTime classStarts = LocalTime.of(10,0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak.format(tf));

        LocalTime secondBreak = firstBreak.plusHours(1);

        System.out.println(secondBreak.format(tf));

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);

        System.out.println(thirdBreak.format(tf));

        LocalTime afternoonClass = thirdBreak.plusHours(1);
        System.out.println(afternoonClass.format(tf));
    }
}
