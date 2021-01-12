package Practice.GroupWork;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str="AAABBCDD";

        System.out.println(FrequencyOfChars(str));
    }


    public static String FrequencyOfChars(String str){

        String[] arr = str.split("");
        String result ="";

       for(int i=0; i<arr.length; i++){

           int count =0;

           for(int j=0; j<arr.length; j++){

               if(arr[j].equals(arr[i])){
                   count++;
               }

           }

           if(!result.contains(arr[i])){
               result+=arr[i]+count;
           }
       }

        return result;
    }

}


