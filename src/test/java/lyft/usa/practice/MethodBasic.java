package lyft.usa.practice;

public class MethodBasic {

	//Creating a Method
	//public is access modifier
	//void used here. we can use data type as follows (int, double, String etc)
	public void myMethod() {
		}
	
	
	// ***this is a void method which returns nothing
	public void getEmployee(){
		}
	
	
	//***this is a return method/non Void Method which returns something
	// using the data type int, double, String
	public int getSalary(){
		return 87000;
		}
	
	public double Bonus(){
		return 5800.25;
	}
	
	public String getName(){
		return "Fahim";
		}
	
	
	// this is a static return method
	public static int getDollar() {
		return 25500;
	}
	
	public static void main(String[] args) {

		//printing the static method directly
		System.out.println(getDollar());
		
		
		//printing the return/non void method
		//Created an object
		// printing bonus
		MethodBasic objName = new MethodBasic();
		objName.Bonus();
		System.out.println(objName.Bonus());
		
		
		//using getSalary
		MethodBasic objName1 = new MethodBasic();
		objName1.getSalary();
		System.out.println(objName1.getSalary());
		
		
		//using getName
		MethodBasic objName2 = new MethodBasic();
		objName2.getName();
		System.out.println(objName2.getName());
		
	}

}
