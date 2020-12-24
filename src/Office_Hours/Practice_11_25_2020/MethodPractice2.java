package Office_Hours.Practice_11_25_2020;

public class MethodPractice2 {

    public static void main(String[] args) {
        max(100,200);
        System.out.println(max(45,67,40));
        System.out.println(max(4,7,2,9));
    }

    public static int max(int a, int b){

        int maximum = (a>=b)?a:b;
        return maximum;
    }

    public static int max(int a, int b, int c){

        return max(max(a,b),c);
    }

    public static int max(int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }

    public static int min(int a, int b){
        int minimum = (a<b)?a:b;
        return minimum;
    }

    public static int min(int a, int b, int c){
        return min(min(a,b),c);
    }

    public static int min(int a, int b, int c, int d){
        return min(min(a,b,c),d);
    }
}

