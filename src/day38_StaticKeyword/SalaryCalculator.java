package day38_StaticKeyword;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours,stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate>1)?stateTaxRate/100:stateTaxRate;  //if tax is given as 6%
        this.federalTaxRate = (federalTaxRate>1)?federalTaxRate/100:federalTaxRate; // sama as state tax
        salary = calculateSalary();
        salaryAfterTax = calculateSalaryAfterTax();
    }

    public double calculateSalary(){
        return hourlyRate*weeklyHours*52;
    }

    public double calculateStateTax(){
       return   calculateSalary()*stateTaxRate;
    }

    public double calculateFederalTax(){
        return calculateSalary()*federalTaxRate;
    }

   public double calculateTotalTax(){
        return calculateFederalTax()+calculateStateTax();
   }

   public double calculateSalaryAfterTax(){
        return salary-calculateTotalTax();
   }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate: $" + hourlyRate +
                ", salary: $" + salary +
                ", salaryAfterTax: $" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){

        return this.salary ==s1.salary;
    }
}
