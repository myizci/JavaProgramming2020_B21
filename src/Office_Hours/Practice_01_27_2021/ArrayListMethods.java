package Office_Hours.Practice_01_27_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("list.size() = " + list.size());

         list.add(1);
         list.addAll(Arrays.asList(3,4,5,6,7,8,9,10,11,12));

        System.out.println(list);

        list.set(3,9);
        System.out.println(list);

       list.remove(3);

        System.out.println(list);

        list.remove(Integer.valueOf(1));  //valueOf returns an object Integer.valueOf("1") is also possible

        System.out.println(list);

        list.set(7,100);

        System.out.println(list);

        System.out.println(list.contains(9));

        Collections.sort(list);

        System.out.println(list);

        Collections.swap(list,1,2);

        System.out.println(list);

        System.out.println(Collections.max(list));

        list.set(2,3);
        System.out.println(list);

        System.out.println(Collections.frequency(list, 3));


        list.forEach(p-> { if(p%2==0) System.out.print(p+  " "); } );  // variables are final, no modification allowed


    }
}
