package com.training.test1;

public class Q2_CurrentAccount extends Q2_Account {
	private float minimumBalance;

    public Q2_CurrentAccount() {}

    public Q2_CurrentAccount(Q2_Owner owner, String number, float balance, float minimumBalance) {
        super(owner, number, balance);
        this.minimumBalance = minimumBalance;
    }

    public float getCharges() {
        if (balance < minimumBalance)
            return 500;
        return 0;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Minimum Balance: " + minimumBalance);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", MinimumBalance=" + minimumBalance;
    }
}
