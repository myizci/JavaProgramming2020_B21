package Replit;

public class Person {
    private String firstName, lastName;
    private int age;

   public void setFirstName(String firstName){
       this.firstName = firstName;
   }

    public String  getFirstName(){
       return this.firstName;
    }

    public void setLastName(String lastName){
       this.lastName = lastName;
    }


    public String getLastName(){
       return this.lastName;
    }

    public void setAge(int age){
       this.age = age;
    }

    public int getAge(){
       return this.age;
    }

    public String toString(){

       return this.firstName + " | "+this.lastName + " | "+ this.age;
    }

    public Person(){
       this.lastName = "undefined";
       this.firstName = "undefined";
       this.age = -1;
    }

    public Person(String firstName, String lastName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }


}
