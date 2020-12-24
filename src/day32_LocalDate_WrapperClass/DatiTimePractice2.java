package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatiTimePractice2 {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");
        LocalDate DofB = LocalDate.of(1977,12,26);

       int age1 = LocalDate.now().minusYears(10).getYear()-DofB.getYear();

        System.out.println(age1);
        System.out.println("===================================");

        LocalDate dateOfBirth = LocalDate.of(2005,5,19);
        System.out.println("you were born on: "+dateOfBirth.format(df));

        int currentAge = LocalDate.now().getYear()-dateOfBirth.getYear();

        if(currentAge>=21){
            System.out.println("You can buy booze");
        }else{
           LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21-currentAge).getYear(),dateOfBirth.getMonthValue(),dateOfBirth.getDayOfMonth());
            System.err.println("you will be eligible on: "+eligible.format(df));
        }
    }


}
