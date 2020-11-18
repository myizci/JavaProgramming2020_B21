package Replit;

public class IsPos {
    public static void main(String[] args) {
        int[] arr1 = {1,2,-3,-4,6};
        int k = 8;
        add_to_r(arr1,k);
    }

    public static void isPos(int[] num){

        for(int i=0; i<num.length; i++){

            if(num[i]<0){
                System.out.println("negative");
            }else if(num[i]>0){
                System.out.println("positive");
            }else{
                System.out.println("zero");
            }
        }
    }

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        int[] new_r = new int[r.length+1];

        for(int i=0; i<new_r.length-1; i++){

            new_r[i]=r[i];
        }

        new_r[new_r.length-1]=n;

        for(int j=0; j<new_r.length;j++){
            System.out.println(new_r[j]);
        }

    }
}
