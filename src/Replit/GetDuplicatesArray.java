package Replit;

public class GetDuplicatesArray {
    public static void main(String[] args) {
String[] arr = {"1","2","aa","1", "aa","aa"};

        System.out.println(getDup(arr));
    }

    public static int getDup(String[] r)
    {
int sum=0;
String temp="";

 for(int i=0; i<r.length; i++){
     int count=0;
     for(int j=0; j<r.length; j++){

         if(r[i].equals(r[j])){

            count++;
         }
     }

     if(count>1&&!temp.contains(r[i])){
         temp+=r[i];
         sum+=count;
     }
 }

return sum;
    }
}
