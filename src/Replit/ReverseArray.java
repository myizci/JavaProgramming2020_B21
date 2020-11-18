package Replit;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
int[] nums1 = new int[nums.length];
       for(int i=0; i<nums.length; i++){
nums1[i]=nums[nums.length-1-i];
       }
        for(int i=0; i<nums.length; i++){
            nums[i]=nums1[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
