package day45_Exceptions;

import java.time.LocalTime;

public class EveryDaysLunchBreak {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,0);

        if(!currentTime.equals(lunchTime)){
            throw new LunchBreakException("No Lunch yet");
        }else{
            System.out.println("Continue");
        }
    }
}
