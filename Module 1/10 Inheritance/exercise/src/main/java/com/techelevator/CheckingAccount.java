package com.techelevator;

public class CheckingAccount extends BankAccount{
    private double depositFee = 10.00;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amount) {
        int balance = super.getBalance();
        if (balance - amount <= -100) {
            System.out.println("Request failed. Unable to withdraw amounts resulting in -$100.00 or less.");
        }
        else if (balance - amount < 0 && balance - amount > -100){
            amount += depositFee;
            System.out.println(amount);
            super.withdraw(amount);
        }
        else {
            super.withdraw(amount);
        }
        return super.getBalance();
    }

    public int deposit(){
        return getBalance();
    }
}
