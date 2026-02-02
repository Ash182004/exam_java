package com.training.test1;

public class merchandise {
	String itemCode;
	int quantity;
	double unitPrice;
	
	public merchandise(String itemCode, int quantity, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
   
	@Override
	public String toString() {
		return itemCode+" "+quantity+" "+unitPrice;
	}
	
	

}
