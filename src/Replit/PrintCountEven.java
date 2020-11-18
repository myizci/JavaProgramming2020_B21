package Replit;

public class PrintCountEven {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};
        int count=0;
        for(int each:nums){

            if(each%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
