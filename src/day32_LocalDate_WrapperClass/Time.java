package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(23,45,13,656);
        System.out.println(t1);

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println("============================");

        LocalDateTime t2 = LocalDateTime.of(2020,11,23,11,51,43,786868686);
        System.out.println(t2);
    }
}
