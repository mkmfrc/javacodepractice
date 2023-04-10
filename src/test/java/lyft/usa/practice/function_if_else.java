package lyft.usa.practice;

public class function_if_else {
	
	
	public static void main(String[] args) {
	
		int camryPrice = 5001;
		
		if(camryPrice >5000) {
			System.out.println("Fahim will not buy the car");
		}
		
		else if(camryPrice <5000) {
			System.out.println("Fahim will buy the car");
		}
		
		else if (camryPrice == 5000) { 
			System.out.println("Fahim will think about it and wait");
		}
		
		else{
			System.out.println("No transaction will happend");
			
		}
	}

}
