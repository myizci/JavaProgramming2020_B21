package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AppendPosSum {
    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
ArrayList<Boolean> list2 = new ArrayList<>(Arrays.asList(true,false,false));
        System.out.println(appendPosSum(list));
        repeatAL(list2);
        System.out.println(list2);
       // System.out.println(twoTimes(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> pos = new ArrayList<>();

        pos.addAll(list);

        pos.removeIf(p->p<=0);
        int sum=0;
        for(Integer each:pos){
            sum+=each;
        }

        pos.add(sum);

        return pos;


    }

    public static void repeatAL(ArrayList<Boolean> list){
        list.addAll(list);

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer each: list){
            result.addAll(Arrays.asList(each,each));
        }


        return result;
    }

    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
    {
        Collections.swap(list,pos1,pos2);
        return list;
    }

    public static String search(ArrayList<String> r, String find)
    {
String result="";
for(String each:r){

    if(each.contains(find)){
        result+=each;
    }
}

if(result.length()>0){
    return result;
}else{
    return "search failed";
}

    }

}
