package Encapsulation;

public class Test {
    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount();
        //BankAccount.setAccountnumber(429288);
        BankAccount.deposit(-10);
        BankAccount.withdraw(100);
        BankAccount.deposit(200);
        BankAccount.withdraw(100);
        System.out.println(BankAccount.getBalance());


    }
}
