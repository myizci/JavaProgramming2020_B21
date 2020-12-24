package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class timesTwo {
    public static void main(String[] args) {
ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4));
timesTwo(nums);
        System.out.println(nums);
    }


    public static void timesTwo(ArrayList<Integer> nums)

    {

        for (int i = 0; i < nums.size(); i++) {
          int t=  nums.get(i) ;
          nums.set(i,2*nums.get(i));

        }

    }

}

