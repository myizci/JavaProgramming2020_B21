package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryObjects {

    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(40, 75, 9, 6);
        SalaryCalculator salary2 = new SalaryCalculator(40, 65, 8, 5);
        SalaryCalculator salary3 = new SalaryCalculator(40, 55, 7, 6);
        SalaryCalculator salary4 = new SalaryCalculator(40, 65, 6, 4);
        SalaryCalculator salary5 = new SalaryCalculator(40, 78, 7, 6);


        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1, salary2, salary3, salary4, salary5));

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAftertax = salaries.get(0).salaryAfterTax;

        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax = salaries.get(0).totalTax;

        for (SalaryCalculator each : salaries) {
            maxSalaryAfterTax = Math.max(each.salaryAfterTax, maxSalaryAfterTax);
            minSalaryAftertax = Math.min(each.salaryAfterTax, minSalaryAftertax);

            maxTotalTax = Math.max(each.totalTax,maxTotalTax);
            minTotalTax = Math.min(each.totalTax,minTotalTax);

        }


        System.out.println("minSalaryAftertax = " + minSalaryAftertax);
        System.out.println("maxSalaryAfterTax = " + maxSalaryAfterTax);

        System.out.println("minTotalTax = " + minTotalTax);
        System.out.println("maxTotalTax = " + maxTotalTax);
        System.out.println("====================================================");


    }

}
