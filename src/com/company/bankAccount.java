package com.company;


public class bankAccount {
    double balance;
    String name;

    // Constructor
    public bankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }

    // Deposit method
    public void deposit(double d)
    {
        double depo = d;
        balance += depo;

    }

    // Withdraw method
    public void withdraw(double w)
    {
        double withd = w;
        balance -= withd;
    }
}
