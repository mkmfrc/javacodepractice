package lyft.usa.practice;

public class Method_Using_Variable_1 {
	
	String Name; 		//Instance variable
	int Salary; 		//Instance variable
	static int Bonus; 	//Static variable
	
	//Public void method
	//to execute void non static method, we have to create an object on main method 
	// and println should be within the specific method
	public void getSalary(){
		Name = "Fahim : ";
		Salary = 5000;
		Bonus = 300;
		int TotalPay = Salary+Bonus;
		System.out.println(Name+ TotalPay);
	}
	
	// return method 
	public int getBonus() {
		Salary = 5500;
		Bonus= 650;
		int TotalPay1= Salary+Bonus;
		return  TotalPay1;
	}
	
	public static void main(String[] args) {
		
		Method_Using_Variable_1 objName = new Method_Using_Variable_1();
		objName.getSalary();
		
		//dnt needed to create multiple object declaring non static method
		objName.getBonus();
		System.out.println(objName.getBonus());
	
		
	}

}
