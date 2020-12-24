package Office_Hours.Practice_12_23_2020;

public class Developer extends Employee{
    public Developer(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Developer", ID, gender, salary, isFullTime);
    }


    public void fixingBug(){
        System.out.println(jobTitle + " "+name+" is fixing bug");
    }

}
