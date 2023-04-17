package com.us.abstruction;

public class ConstClassName {

	
	ConstClassName(int salary, double bonus){
		System.out.println(salary + bonus);
	}
	
	ConstClassName(String name){
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		ConstClassName obj = new ConstClassName("Masud pagla");
	

	}

}
