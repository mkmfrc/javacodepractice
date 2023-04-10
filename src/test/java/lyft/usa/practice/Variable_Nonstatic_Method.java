package lyft.usa.practice;

public class Variable_Nonstatic_Method {
	
	static String name;  	//static variable
			int bonus;		//instance variable
			int salary;		//instance variable
		
	//void method
		public void getSalary2(){
			name= "Rafi : ";
			bonus= 41;
			salary= -3500;
			int total5 = bonus+salary;
			System.out.println(name + total5);
	}
	
	//Retun or non-void method
		public String getBonus2(){
			name = "Kaniz ";
			bonus = 800;
			salary = 12500;
			int totalBonus = bonus + salary;
			return name + totalBonus;
	}
		
		public static void main(String[] args) {
		
	//void method
		Variable_Nonstatic_Method objSalary = new Variable_Nonstatic_Method();
		objSalary.getSalary2();

	//Retun or non-void method
		Variable_Nonstatic_Method objBonus = new Variable_Nonstatic_Method();
		System.out.println(objBonus.getBonus2());
		
	} 

}
