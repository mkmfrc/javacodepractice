package lyft.usa.practice;

public class VerifyTheValue {
	
	
	//How do you varify the expected value
	
	//Ans: by using java if/else condition
	
	public static void main(String[] args) {
		

		// Fahim want to sale more than $195
		// Fahim wants to buy if price goes above $195
		
		int teslaPrice = 195;
	
		if(teslaPrice>195) {
		System.out.println("Fahim sold his stock");	
		}
		
		else if (teslaPrice<195) {
			System.out.println("Fahim buy the stock");
		}
		
		else if (teslaPrice == 195) {
			System.out.println("Fahim want to sell his stock by buying price");
		}
		
		else {
			System.out.println("No transaction took place");
		
		}

	}
}
