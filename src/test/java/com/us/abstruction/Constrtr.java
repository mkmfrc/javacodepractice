package com.us.abstruction;

public class Constrtr {

	
	Constrtr(String name, int bonus){
		System.out.println(name + bonus );
	}
	
	Constrtr(double salary){
		System.out.println(salary);
	
	}
	
	public void getMethod(){
		System.out.println("Something");
	}
	
	public static void main(String[] args) {
		
		Constrtr obj= new Constrtr("rakib", 15000);
		//obj= new Constrtr();
	}
}
