package lyft.usa.practice;

public class Static_use {

	 String requirements; //instance variable
	
	public void employeePayment() {
		
		requirements= "Tanvir's payment for January  : "; //used instance variable
		Static_dec.salary= 11000;   	//used static variable from another class
		Static_dec.bonus= 4500;			//used static variable from another class
		int festibalBonus= 6500; 		//local variable
		int total = Static_dec.salary+ Static_dec.bonus+festibalBonus; //local variable
		System.out.println(requirements+total);
	}
	 //note: as its a static method we can not use instance variable within this.
	public static void employeeDetails1() {
		
		String details= "Tanvir's payment for September : "; //created local variable
		Static_dec.salary= 15000;			//used static variable from another class
		Static_dec.bonus= 5500;				//used static variable from another class
		int festibalBonus= 6500; 			//local variable
		int total = Static_dec.salary+ Static_dec.bonus+festibalBonus;	//local variable
		System.out.println(details+total);
	}
	public static void main(String[] args) {

		//object created as non static
		Static_use obj= new Static_use();	
		obj.employeePayment();
		
		//no need to create object as its static
		Static_use.employeeDetails1(); 		
		
	}

}
