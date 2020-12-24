package day39_StaticBlocks;

import day37_Custom_Class.Employee;

public class HumanResource {

    public static Employee employee1,employee2, employee3, employee4, employee5;
    public static String company;
    public static boolean isEmployee;


    static {


        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();


        company = "BankOfAzerbaijan";
        isEmployee =true;
        employee1.setInfo("Omer",company,"SDET","123","Male",40,75);
        employee2.setInfo("Buket",company,"QA","124","Female",40,85);
        employee3.setInfo("Halid",company,"Developer","125","Male",40,95);
        employee4.setInfo("Nukhet",company,"SDET","126","Female",40,65);
        employee5.setInfo("Nimet",company,"QA","127","Female",40,80);

    }





}
