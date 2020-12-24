package day38_StaticKeyword;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator();
        SalaryCalculator salary2 = new SalaryCalculator();

        salary1.setInfo(60,40,6.5,2);

        System.out.println(salary1);

        salary2.setInfo(55,40,6.5,2);
        System.out.println(salary2);

        System.out.println(salary1.equals(salary2));
    }
}
