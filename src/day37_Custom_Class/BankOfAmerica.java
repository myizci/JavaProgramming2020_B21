package day37_Custom_Class;

public class BankOfAmerica {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Omer", employee1.company, "SDET","123","Male",40,75);
        System.out.println(employee1);

    }
}
