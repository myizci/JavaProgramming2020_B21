package Replit;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i=0; i<size; i++){
//            nums[i]=scan.nextInt();
//        }

int[] nums = {1,2,3,4,5};
int[] nums2 = new int[nums.length];
for(int i=0; i<nums.length-1; i++){
    nums2[i]=nums[i+1];

}
nums2[nums2.length-1]=nums[0];

        System.out.println(Arrays.toString(nums2));

    }
}
