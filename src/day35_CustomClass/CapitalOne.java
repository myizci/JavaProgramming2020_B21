package day35_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setInfo("Omer T","5093898");
        account1.getInfo();
        account1.deposit(12000);
        account1.showBalance();
        account1.withdraw(890);
        account1.showBalance();
    }
}
