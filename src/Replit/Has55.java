package Replit;

public class Has55 {
    public static void main(String[] args) {
        int[] nums={1,5,5,8,5};
        boolean result = false;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i]==5)&&(nums[i+1]==5)){
                result=true;
            }
        }

        System.out.println(result);
    }
}
