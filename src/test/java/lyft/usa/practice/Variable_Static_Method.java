package lyft.usa.practice;

public class Variable_Static_Method {
	
	static String name;  	//static variable
	static int bonus;		//static variable
	static int salary;		//static variable
	
	
	//static void method
	public static void getSalary(){
		name= "Rafi : ";
		bonus= 41;
		salary= -3500;
		int total5 = bonus+salary;
		System.out.println(name + total5);
	}
			
//static return or non-void method		
	public static String getBonus(){
		name = "Kaniz :";
		bonus = 1800;
		salary = 12500;
		int totalBonus = bonus + salary; //local variable
		return name + totalBonus;
}
	public static void main(String[] args) {
		
	//static void method	
		Variable_Static_Method.getSalary();
		
	//static return or non-void method	
		System.out.println(Variable_Static_Method.getBonus());	
	} 
	
	
	
}