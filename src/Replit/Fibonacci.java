package Replit;

public class Fibonacci {
    public static void main(String[] args) {
        int k=7;
        fib(k);
    }

    public static void fib(int num){


int[] fibo = new int[num];
fibo[0]=0;
fibo[1]=1;


        for(int i=0; i<num-2;i++){
            fibo[2+i]=fibo[1+i]+fibo[i];

        }
        System.out.println(fibo[num-1]);

    }
}
