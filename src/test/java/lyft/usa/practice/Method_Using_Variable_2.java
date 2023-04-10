package lyft.usa.practice;

public class Method_Using_Variable_2 {
	
	//static mathod only deals with static variable
	
	static String Name; 		//Static variable
	static int Salary; 		//Static variable
	
	static int Bonus; 	//Static variable
			
	//- - - - - - - - - - - - - - 
	
	//Public static void method
	// and println should be within the specific method
	public static void getSalary(){
		Name = "Fahim : ";
		Salary = 5000;
		Bonus = 300;
		int totalSalary = Salary+Bonus;
		System.out.println(Name+ totalSalary);
	}
	
	// return method 
	public  static int getBonus() {
		Salary = 5500;
		Bonus= 650;
		int TotalPay1= Salary+Bonus;
		return  TotalPay1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Method_Using_Variable_2.getSalary();
		
		//System.out.println(Method_Using_Variable_2.getBonus());
	}

}

//till now my understanding on where to keep the Print Statement while executing Static or Instance method. correct me if im worng. its just my realization

//***while executing any VOID method : 
//1. Print Statement should be within this method.
//2. by creating object on the main method we can declare it by using className

//***While executing any return method: 
//1. Return will be within the method
//2. Print stream should be on Main Method 
//3. by creating object and with the help of Print Statement we can declare this.