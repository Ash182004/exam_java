package com.training.test1;

public class Q2_Account {
	protected Q2_Owner owner;
    protected float balance;
    protected String number;

    public Q2_Account() {}

    public Q2_Account(Q2_Owner owner, String number, float balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public Q2_Account(Q2_Account a) {
        this.owner = a.owner;
        this.number = a.number;
        this.balance = a.balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public float getBalance() {
        return balance;
    }

    public void print() {
    	System.out.println("owner"+owner);
        System.out.println("Account No: " + number);
        System.out.println("Balance: " + balance);
      
    }

    @Override
    public String toString() {
        return "Account[" + number + ", Balance=" + balance + ", " + owner + "]";
    }
}
