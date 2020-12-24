package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        LocalDateTime day33 = LocalDateTime.of(2020, 11, 24, 13, 0);
        LocalDateTime d1 = LocalDateTime.now();

        DateTimeFormatter my = DateTimeFormatter.ofPattern("E hh:mm a , MMMM/dd/yyyy");

        System.out.println(day33.format(my));
        System.out.println(d1.format(my).replaceFirst("PM", "pm"));

        System.out.println("=========================================================");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEE");

        LocalDate[] days = new LocalDate[5];

        for (int i = 0; i < days.length; i++) {

            days[i] = LocalDate.now().plusDays(i + 1);
        }

        System.out.println(Arrays.toString(days));
        for (LocalDate each :days){
            System.out.println(each.format(df));
        }

        System.out.println("==============================");

        String[] names ={"Salih", "Nukhet", "Buket","Halid","Nimet"};

        LocalDate[] bds = {
                LocalDate.of(2016,6,13),
                LocalDate.of(2008,5,21),
                LocalDate.of(1981,12,3),
                LocalDate.of(2005,4,12),
                LocalDate.of(2011,6,21)
        };

        String nameOfOlder = names[0];
        LocalDate older=bds[0];

        String nameOfYoungest = names[0];
        LocalDate younger=bds[0];

        for(int i=0; i<bds.length;i++ ){
            if(bds[i].isBefore(older)){
                older = bds[i];
                nameOfOlder = names[i];
            }
            if(bds[i].isAfter(younger)){
                younger = bds[i];
                nameOfOlder = names[i];
            }

        }

        System.out.println("nameOfOlder = " + nameOfOlder);
        System.out.println("birthdate = " + older.format(df));
        System.out.println();

        System.out.println("nameOfYoungest = " + nameOfYoungest);
        System.out.println("birthdate = " + younger.format(df));

    }
}
