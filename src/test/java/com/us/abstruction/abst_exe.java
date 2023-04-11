package com.us.abstruction;

public class abst_exe extends abst_Class {

	
	
	@Override
	public void getPayment() {
		System.out.println("our abstract method is now a concrete method");
		
	}
	
	
	public static void main(String[] args) {
		abst_exe obj = new abst_exe();				//this is new object
		obj.getBonus();
		obj.getPayment();
		obj.getSalary();

	}

	

}
