package Practice.GroupWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Practice {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018,1,10);
        LocalTime time = LocalTime.of(14,42);

        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(dateTime);



        }


        public static boolean g(boolean k){

       if(k){
           return k;
       }else if(!k){
           return !k;
       }

       return false;
        }

    }



