package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Josh","Miller",12345);

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getBalance());
        obj1.availableBalance();

        obj1.deposit(-200);

        System.out.println("=====================");

        obj1.deposit(100);
        obj1.availableBalance();
        //BankAccount.bankName = "Akbank";
        System.out.println(BankAccount.bankName);
    }
}
