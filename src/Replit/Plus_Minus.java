package Replit;

public class Plus_Minus {
    public static void plus_minus(int[] arr){
int countp=0;
int countn=0;
int countz=0;

for(int i=0; i<arr.length; i++){

    if(arr[i]>0){

        countp++;
    }else  if(arr[i]<0){

        countn++;
    } else{

        countz++;
    }
}
        System.out.println("positives:"+countp+", negatives:"+countn+", zeros:"+countz);


    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,-4,-5,0};

        plus_minus(arr1);
    }
}
