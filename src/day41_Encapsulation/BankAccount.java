package day41_Encapsulation;

public class BankAccount {
    public final static String bankName="Bank of America";
    public String firstName, lastName;
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        setAccountHolder(firstName,lastName);
        setAccountNumber(accountNumber);
    }

    public void setAccountHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName.toUpperCase() + " "+ lastName.toUpperCase();
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }


    public void deposit(double amount){

        if(amount<0){

            System.out.println("Invalid number: " + amount);
            return;
        }
        System.out.println("Depositing "+ amount+ " to "+accountNumber);
        setBalance(balance+amount);
    }

    public void withDraw(double amount){

        if(amount>balance){
            System.out.println("Not enough balance for withdrawal");
            return;
        }

        System.out.println("Withdrawing $"+amount+ " from "+accountNumber);
        setBalance(balance-amount);

    }

    public void availableBalance(){

        System.out.println("Available Balance of the account# "+getAccountNumber()+" is: "+getBalance());
    }

}
