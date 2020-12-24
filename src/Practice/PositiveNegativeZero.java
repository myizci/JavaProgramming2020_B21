package Practice;

public class PositiveNegativeZero {

    public static void main(String[] args) {
int[] arr1 = {1,2,3,-4,-5,0};

plus_minus(arr1);

    }

    public static void plus_minus(int[] arr){

        int countp=0;
        int  countn=0;
        int countz=0;

        for(int each:arr){

            if(each>0){

                countp++;
            }else if(each<0){

                countn++;
            }else countz++;
        }
        System.out.println("p= " +countp +" n= "+countn+ " z= "+countz);

    }
}
/*

public static int c_a(String[] arr, String word )

        int count=0;

    for(int i=0; i<arr.length; i++){
      if(arr[i].equals(word)){
      count++;
      }
    }
return count;







 */