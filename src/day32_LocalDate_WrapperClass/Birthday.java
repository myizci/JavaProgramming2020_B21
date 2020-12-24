package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        String[] names= {"Halid", "Nukhet","Nimet","Salih" };
        LocalDate[] birthdays ={
                LocalDate.of(2005,04,12),
                LocalDate.of(2008,5,21),
                LocalDate.of(2011,6,21),
                LocalDate.of(2016,6,13)
        };


        for(int i=0; i<names.length; i++){
            System.out.println(names[i] + "'s birthdate is "+birthdays[i]);
            System.out.println(names[i]+"'s birthyear is leapyear: "+birthdays[i].isLeapYear());

        }
    }
}
