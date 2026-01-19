package com.training.test1;

public class Q2_SavingsAccount extends Q2_Account  {
	private float interestRate;

    public Q2_SavingsAccount() {}

    public Q2_SavingsAccount(Q2_Owner owner, String number, float balance, float interestRate) {
        super(owner, number, balance);
        this.interestRate = interestRate;
    }

    public float getInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Interest Rate: " + interestRate);
    }

    @Override
    public String toString() {
        return super.toString() + ", InterestRate=" + interestRate;
    }
}
