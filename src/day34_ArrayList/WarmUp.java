package day34_ArrayList;

import java.util.ArrayList;
public class WarmUp {
    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5); //  Alist={"burger","coca","chips","salad"}
        System.out.println(aList);
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i) % 2 != 0) {     // aList[i]
                aList.set(i, aList.get(i) * 2); // set = modify
            }//multiplies odd elements by 2
        }

        System.out.println(aList);
        aList.set(aList.size() - 1, 0); //last element is repl by 0
        System.out.println(aList);

        System.out.println("======================================");

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98, -21,445,45};
        // how many students has A,BC, print out only A, B, or C

        ArrayList AList = new ArrayList();
        ArrayList BList = new ArrayList();//empty
        ArrayList CList = new ArrayList();
        ArrayList DList = new ArrayList();
        ArrayList FList = new ArrayList();

        for (int i = 0; i < scores.length; i++) {
            int each = scores[i];
            if (each >= 0 && each <= 100) {
                if (each >= 90) {
                    AList.add(each);
                } else if (each >= 80) {
                    BList.add(each);
                } else if (each >= 70) {
                    CList.add(each);
                } else if (each >= 60) {
                    DList.add(each);
                } else {
                    FList.add(each);
                }
            } else {
                continue;
            }
        }

        System.out.println("A: "+ AList);
        System.out.println("B: "+ BList);
        System.out.println("C: "+ CList);
        System.out.println("D: "+ DList);
        System.out.println("F: "+ FList);

    }
}
