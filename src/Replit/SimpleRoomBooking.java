package Replit;

import java.time.LocalDate;

public class SimpleRoomBooking {
    public static void main(String[] args) {

    }

    public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {

        boolean result =false;
        if(isAvailable){
            LocalDate room = LocalDate.of(year,month, day);
            LocalDate startOfUnavailability = LocalDate.of(2018,7,1);
            LocalDate endOfUnavailability = LocalDate.of(2018,7,8);

            if(room.isBefore(startOfUnavailability)||room.isAfter(endOfUnavailability)&&year==2018){
                return true;
            }

        }else{

            result= false;
        }

return result;
    }
}
