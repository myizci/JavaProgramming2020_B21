package Practice.GroupWork;

public class replit135 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3};

        boolean result = false;

        int count2 = 0;
        for (int each : arr2) {
            int count = 0;
            for (int element : arr1) {

                if (each == element) {
                    count++;
                }
            }
            if (count > 0) {
                count2++;  // if count>0 "each" exists in arr1
            }            //  increase count2 must be equal to length of arr2,
        }
        System.out.println(count2);
        result = (count2 == arr2.length);
        System.out.println(result);
    }
}
