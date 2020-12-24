package Library;
import day43_Inheritance.PersonTask.Employee;

import static day41_Encapsulation.Data.publicVariable;

public class Test {

    public static void main(String[] args) {
        System.out.println(publicVariable);
        //System.out.println(privateVariable);
        //System.out.println(defaultVariable);




    }

    class  A extends Employee {
      String c  = publicVariable;
      String d = protectedVariable;

    }


}
