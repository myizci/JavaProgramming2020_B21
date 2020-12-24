package Practice.GroupWork;

public class Replit180 {
    public static void main(String[] args) {

        String main= "Hello";
        String coverMe = "lo";  // Hel[lo]
        System.out.println(coverString(main,coverMe));
    }

public static String coverString(String main,String coverMe){
String result="";
        if(main.contains(coverMe)){

        result=    main.replaceAll(coverMe,"["+coverMe+"]");
        }
return  result;

}

}
