package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public BankCustomer(){}

    public Accountable[] getAccounts(){
        Accountable[] array = accounts.toArray(new Accountable[accounts.size()]);
        return array;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public boolean isVip(){
        double totalBalance = 0;

        for (Accountable accountBalance: accounts){
            totalBalance += accountBalance.getBalance();
        }

        System.out.println(totalBalance);

        if (totalBalance >= 25000){
            return true;
        }
        return false;
    }

    @Override
    public int getBalance() {
        return getBalance();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
