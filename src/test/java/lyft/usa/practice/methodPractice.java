package lyft.usa.practice;

public class methodPractice {

	
	//This is parameterized method.
		public void getEmployeeInfo(int salary,int bonus ){
		
			//salary= 15000;
			//bonus= 3500;
			int total = salary + bonus;
			System.out.println(total);
			
		}
	
	public static void main(String[] args) {
		
		methodPractice objName = new methodPractice();
		
		objName.getEmployeeInfo(11500, 4200);
	
		objName.getEmployeeInfo(3000, 4700);
		
		objName.getEmployeeInfo(1578888, 4200);
		
		
		
	}

}
