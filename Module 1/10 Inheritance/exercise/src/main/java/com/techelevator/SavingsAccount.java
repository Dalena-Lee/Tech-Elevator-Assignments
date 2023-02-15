package com.techelevator;

public class SavingsAccount extends BankAccount{
    private double depositFee = 2.00;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amount) {
        double balance = getBalance();
        if (balance - amount < 2) {
            System.out.println("Request failed. Unable to withraw amounts resulting in $0 or less.");
        }

        else if (balance - amount < 150 && balance - amount > 0) {
            amount += depositFee;
            super.withdraw(amount);
        }
        else {
            super.withdraw(amount);
        }
        return super.getBalance();
    }

    public int deposit() {
        return getBalance();
    }
}
