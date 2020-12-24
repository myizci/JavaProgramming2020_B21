package day43_Inheritance.Restaurant;

import day43_Inheritance.PersonTask.Employee;

public class Chef extends Employee {

    /*
    inherited name, age ...
    methods, work, setInfo, toString , ...
     */

    public Chef(String name, int age, char gender,double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }


    public void makeOrder(){
        System.out.println(jobTitle + " "+ name + " is making order");
    }
}
