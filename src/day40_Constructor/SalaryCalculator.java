package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {

  public static int numberOfWorkingDays, numberOfWeeks;
  public double weeklyHours,hourlyRate, stateTaxRate, federalTaxRate,salary,salaryAfterTax, totalTax;

  static {
      numberOfWeeks =52;
      numberOfWorkingDays=5;
  }

    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        if(stateTaxRate > 1){
            stateTaxRate /= 100;
        } // converts tax rate to decimal
        if(federalTaxRate > 1){
            federalTaxRate /= 100;
        }// converts tax rate to decimal
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "salary=$" + df.format(salary) +
                ", salaryAfterTax=$" + df.format(salaryAfterTax) +
                '}';
    }
}

