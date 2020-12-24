package day39_StaticBlocks;

import day37_Custom_Class.Employee;

public class StaticBlocks {
    public static String company;
    public static Employee employee1 = new Employee();
    public int a;
    public static int b;
public static boolean isEmployee;

    static {
        company = "Capital One";
        isEmployee = true;

        employee1 = new Employee();
        employee1.setInfo("Omer",company,"SDET","123","Male",40,75);
       // a = 10;  // since a is not static, it gives an error
        b = 200;
    }

//    public static void main(String[] args) {
//
//        company = "Capital One";
//        isEmployee =true;
//        employee1 = new Employee();
//        employee1.setInfo("Omer", "ff","ff","rr","nn",3,3);
//        b=200;
//        System.out.println(StaticBlocks.company);
//        System.out.println(StaticBlocks.employee1);
//        System.out.println(StaticBlocks.b);
//        System.out.println(StaticBlocks.isEmployee);
//    }

}
