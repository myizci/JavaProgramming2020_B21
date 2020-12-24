package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

String[] countries = {"Andorra", "United Arab Emirates", "Afganistan", "Turkey","United States"};
       // ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("UnitesStatesOfAmerica",
            //    "Netherlands","UnitedKingdom","Bulgaria","Greece"));

          ArrayList<String> countries1 = new ArrayList<>(Arrays.asList(countries));

//        for(int i=0; i<countryNames.size();i++){
//            if(countryNames.get(i).length()>=10){
//                countryNames.remove(countryNames.get(i));
//
//            }
//        }


    countries1.removeIf(p->p.length()>=10);
        System.out.println(countries1);

        System.out.println("============================================");


        ArrayList<LocalDate> localdate = new ArrayList<>();

        localdate.add( LocalDate.of(2015,7,15));
        localdate.add( LocalDate.of(2017,12,03));
        localdate.add( LocalDate.of(2020,12,01));
        localdate.add( LocalDate.of(2008,8,19));
LocalDate aa = LocalDate.of(2019,8,15);

       // DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyy/MMM/dd").


        localdate.removeIf(p->p.isBefore(aa));
        //System.out.println(localdate);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");
        for(LocalDate each: localdate ){
            System.out.println(each.format(df));
        }


        //jobTitles.retainAll(p->)

    }
}
