package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {
       // Employee employee1 = new Employee();
       String companyName = "Bank of America";
        Employee[] employees = {
                new Employee(), // index 0
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()// index 4
        };

        employees[0].setInfo("Omer",'M',"SDET",companyName,220000,"509", LocalDate.of(2020,5,1));
        employees[1].setInfo("Buket",'F',"QA",companyName,250000,"510", LocalDate.of(2021,6,1));
        employees[2].setInfo("Dragisa",'M',"Developer",companyName,130000,"508", LocalDate.of(2020,7,2));
        employees[3].setInfo("Sladjan",'M',"System Analyst",companyName,180000,"511", LocalDate.of(2021,9,1));
        employees[4].setInfo("Ahmad",'M',"QA",companyName,170000,"512", LocalDate.of(2020,8,2));

        for(Employee each:employees){
            each.getInfo();
        }
        System.out.println("=============================================");
        ArrayList<Employee> SDETsAndDev = new ArrayList<>();

        SDETsAndDev.addAll(Arrays.asList(employees));

        SDETsAndDev.removeIf(p-> !(p.jobTitle.equals("SDET")||p.jobTitle.equals("Developer")));

        for(Employee each :SDETsAndDev){

            System.out.println(each.name +": "+ each.jobTitle+ " Salary: "+each.salary) ;
        }

        System.out.println("===================================================");

        ArrayList<Employee> Above200K = new ArrayList<>();

        Above200K.addAll(Arrays.asList(employees));

        Above200K.removeIf(p->p.salary<200000);

        for(Employee each :Above200K){

            System.out.println(each.name +": "+ each.jobTitle+ " Salary: "+each.salary) ;
        }

        System.out.println("======================================================");

        double maxSalary = employees[0].salary;//Assume the first employee's salary is the max
String name = "";
        for(Employee each:employees){

          // Math.max(maxSalary,each.salary); //Math.max assign the max value in the loop to maxSalary variable

            if(each.salary>maxSalary){
                maxSalary= each.salary;
                name=each.name;

            }
        }
        System.out.println("name: "+name+ " maxSalary = " + maxSalary);

    }
}
