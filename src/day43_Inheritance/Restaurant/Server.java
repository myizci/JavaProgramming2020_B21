package day43_Inheritance.Restaurant;

import day43_Inheritance.PersonTask.Employee;

public class Server extends Employee {


    public Server(String name, int age, char gender,double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }

    public void takeOrder(){
        System.out.println(jobTitle + " "+ name + " is taking orders");
    }

}
