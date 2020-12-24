package Replit;

public class Replit205 {
    public static void main(String[] args) {


    }

    public static int[] populate(int[] r) {  // array r's length r[0]=1, r[1]=2,r[2]=3......

        for (int i = 0; i < r.length; i++) {

            r[i] = i+1;// array r's length r[0]=1, r[1]=2,r[2]=3......
            r[i]+=2*r[i];
        }
return r;
    }
// r[i] = i+1 ,then add 2 times the value of r[i]



}
/*
int[] arr = {1,2,3,4,5,6,7}

return sum of odd numbers
 sum =0;

if(arr[i]%2!=0)
sum+= arr[i];

 */