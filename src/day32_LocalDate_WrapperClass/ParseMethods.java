package day32_LocalDate_WrapperClass;

public class ParseMethods {
    public static void main(String[] args) {

        String data1 ="123";

        System.out.println(data1+3);

        int num1 = Integer.parseInt(data1); // no boxing int==>int

        Integer num2 = Integer.parseInt(data1); //autoboxing

        System.out.println(num1+3);

        String s1 = "Hello";

       // int num3 = Integer.parseInt(s1);

       // System.out.println(num3);

        String s2 = "2.5";
       double d1= Double.parseDouble(s2);
       // primitive ==> primitive

        Double d2 = Double.parseDouble(s2);
        System.out.println(d1);


        String s3 = "Maybe";

       boolean r1= Boolean.parseBoolean(s3); // primitive==>primitive, no boxing
       Boolean r2 = Boolean.parseBoolean(s3);// primitive to Wrapper class, auto boxing.
        System.out.println(r1); // default value is false

        String s4= "FaLse";
        boolean r3 = Boolean.parseBoolean(s4);
        System.out.println(r3);

    }


}
