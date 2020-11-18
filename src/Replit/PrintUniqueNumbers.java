package Replit;

public class PrintUniqueNumbers {

    public static void main(String[] args) {
int[] numbers= {2, 5, 5, 6, 3, 6, 9, 34, 3};
printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] nums){

        for(int i=0; i< nums.length; i++){

            int count =0;

            for(int j=0; j< nums.length; j++){

                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count==1){
                System.out.println(nums[i]);
            }
        }
    }
}
