package Replit;

public class CoverMe {
    public static void main(String[] args) {
String m1 = "java methods";
String m2 = "mz";
        System.out.println(coverString(m1,m2));
    }

    public static String coverString(String main, String coverME) {
if(main.contains(coverME)){

    main=main.replaceAll(coverME,"["+coverME+"]");
}else main = "["+main+"]";

return main;
    }
}
