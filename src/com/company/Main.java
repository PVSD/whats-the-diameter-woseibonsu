package com.company;

public class Main {

    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount(0.0, "Winston Osei-Bonsu");
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100.0);
        System.out.println("The " + myAccount.name + " account balance is " + myAccount.balance);
    }
}
