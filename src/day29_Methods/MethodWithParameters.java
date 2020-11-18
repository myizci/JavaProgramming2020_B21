package day29_Methods;

public class MethodWithParameters {
    public static void main(String[] args) {

        int[] myArr = {1,2,3,2,1};
        arrayMinNum(myArr);
arrayUniqueElements(myArr);
    }


    public static void arrayMinNum(int[] arr){

        int min = arr[0];

        for (int each: arr)

            if(each<min)

                min=each;


        System.out.println("min = " + min);
    }

    public static void arrayUniqueElements(int[] arr){

        String result="";
        for(int each:arr){
            int count=0;

            for(int element:arr){
                if(each==element){
                    count++;
                }
            }

            if(count==1){
                result+=each + " ";
            }
}

        System.out.println(result);

    }
}


