package day43_Inheritance.PersonTask;

public class Developer extends Employee{ //Developer IS a person, Developer is An Employee
    /*
    Inherited:
    variables: name,age,gender,hourlyRate, jobTitle

     */

    public Developer(String name, int age, char gender,double hourlyRate, String jobTitle, String ID) {
        //setInfo(name, age,gender,hourlyRate,jobTitle,ID);
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void code(){
        System.out.println(jobTitle + " " + name + " is coding");
    }


}
