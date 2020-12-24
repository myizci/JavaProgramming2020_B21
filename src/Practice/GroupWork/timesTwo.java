package Practice.GroupWork;

import java.util.ArrayList;
import java.util.Arrays;

//This method should take the ArrayList parameter and multiply every value by two.
public class timesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<Integer>(Arrays.asList(1,1,2,3,1,4));

        System.out.println(removeInst(h,1));


    }
/*
This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

removeInst([1,1,2,3,1,4],1)
returns: [2,3,4]

removeInst([3,4,3,3],4)
returns: [3,3,3]


 */

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {

        r.removeIf(p->p==n);
        return r;
    }

}