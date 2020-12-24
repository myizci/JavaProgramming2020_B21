package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.of(2020,11,22) ;
        System.out.println(yesterday);

//        LocalDate d1 = LocalDate.of(2019,2,29);
//        System.out.println(d1);

        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate DOB = LocalDate.of(1977,12,26);
        System.out.println("Omer's birth year is a leap year: " + DOB.isLeapYear());
    }
}
