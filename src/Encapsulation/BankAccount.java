package Encapsulation;
public class BankAccount {
    private long accountnumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("invalid deposit amount");
        }
    }

    public void withdraw ( double amount){
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println("invalid withdraw or insufficent balance");
        }


    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

