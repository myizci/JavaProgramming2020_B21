package Office_Hours.Practice_12_23_2020;

public class Tester extends Employee{

    public static boolean isCool;

    static{
        isCool = true;
    }

    public Tester(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Tester", ID, gender, salary, isFullTime);
    }

    public void foundBug(){
        System.out.println(jobTitle+ " "+name+ " found a bug");
    }


}
