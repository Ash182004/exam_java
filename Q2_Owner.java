package com.training.test1;

public class Q2_Owner {
	private String name;
    private Q2_Date dateOfBirth;
    private String id;

    public Q2_Owner() {}

    public Q2_Owner(String name, String id, Q2_Date dob) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = new Q2_Date(dob);
    }

    public Q2_Owner(Q2_Owner o) {
        this.name = o.name;
        this.id = o.id;
        this.dateOfBirth = new Q2_Date(o.dateOfBirth);
    }

    public void input(String name, String id, Q2_Date dob) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = new Q2_Date(dob);
    }

    public void print() {
        System.out.println("Owner Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("DOB: " + dateOfBirth);
    }

    @Override
    public String toString() {
        return name + " (" + id + "), DOB: " + dateOfBirth;
    }


}
