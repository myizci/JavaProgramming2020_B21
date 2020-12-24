package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {
    public String accountName;
    public String accountNumber;
    public double availableBalance=0;

    public void setInfo(String acctName,String acctNumber){

        accountName = acctName;
        accountNumber = acctNumber;
    }


    public void getInfo(){
        System.out.println("Date: "+LocalDate.now());
        System.out.println("Account Name: "+accountName );
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+availableBalance);
    }

  public void deposit(double amount){

        availableBalance+=amount;
      System.out.println("Your new balance is: $"+availableBalance);
  }

    public void withdraw(double amount){

        availableBalance-=amount;
        System.out.println("Your new balance is: $"+availableBalance);
    }

    public void showBalance(){
        System.out.println("As of "+ LocalDate.now()+ ", your available balance is: $"+availableBalance);
    }

}
