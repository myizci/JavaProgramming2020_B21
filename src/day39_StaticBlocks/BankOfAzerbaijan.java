package day39_StaticBlocks;

import day37_Custom_Class.Employee;

import java.util.ArrayList;

public class BankOfAzerbaijan {

    public static void main(String[] args) {
        ArrayList<Employee>  employees = new ArrayList<>();

        employees.add(HumanResource.employee1);
        employees.add(HumanResource.employee2);
        employees.add(HumanResource.employee3);
        employees.add(HumanResource.employee4);
        employees.add(HumanResource.employee5);

        System.out.println(employees.get(0));
    }


}
