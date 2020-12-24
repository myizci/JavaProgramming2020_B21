package day38_StaticKeyword;

public class iPhoneObjects {
    public static void main(String[] args) {
        iPhone iPhone1 = new iPhone();
        iPhone iPhone2 = new iPhone();


        System.out.println(iPhone1.OS);

        iPhone1.OS = "Android";


        System.out.println(iPhone1.OS);
        System.out.println(iPhone2.OS);


    }
}
