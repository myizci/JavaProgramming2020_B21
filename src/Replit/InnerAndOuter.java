package Replit;

public class InnerAndOuter {
    public static void main(String[] args) {

        int[] outer = {1, 2, 4, 6,7,9};
        int[] inner = {9, 4};

        boolean result = true;
        int[] count = new int[inner.length];
        for (int i = 0; i < inner.length; i++) {

            for (int j = 0; j < outer.length; j++) {

                if (inner[i] == outer[j]) {
                    count[i]++;

                }

            }
        }

        for (int i = 0; i < inner.length; i++) {

            if(count[i]==0){

                result =false;
break;

            }else{
                result = true;

            }
        }
        System.out.println(result);

    }
}
