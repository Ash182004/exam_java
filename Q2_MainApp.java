package com.training.test1;

public class Q2_MainApp {
	public static void main(String[] args) {

        Q2_Date dob = new Q2_Date(10, 5, 2002);
        Q2_Owner owner = new Q2_Owner("Raj", "A101", dob);

        Q2_SavingsAccount sa =
                new Q2_SavingsAccount(owner, "SB1001", 50000, 4.5f);

        Q2_CurrentAccount ca =
                new Q2_CurrentAccount(owner, "CA2001", 20000, 10000);

        System.out.println("----- Savings Account -----");
        sa.print();
        System.out.println("Interest: " + sa.getInterest());

        System.out.println("\n----- Current Account -----");
        ca.print();
        System.out.println("Charges: " + ca.getCharges());
    }

}
