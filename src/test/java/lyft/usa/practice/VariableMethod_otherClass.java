package lyft.usa.practice;

public class VariableMethod_otherClass {

	String empName; // instance variable

	public void getPayment() {
		String empName = "Kaniz :";
		variableMethod.Salary = 11500;
		variableMethod.Bonus = 7500;
		int incentive = 3500;
		int totalPayment = variableMethod.Salary + variableMethod.Bonus + incentive;
		System.out.println(empName + totalPayment);
	}

	public String getEmpInfo() {
		empName = "Nasrin's net total payment for last year : ";
		variableMethod.Salary = 125000;
		variableMethod.Bonus = 25600;
		int commission = 17500;
		int donation = 30000;
		int totalNetPay = variableMethod.Salary + variableMethod.Bonus + commission - donation;
		return empName + totalNetPay;
	}

	public static void main(String[] args) {

		VariableMethod_otherClass objPayment = new VariableMethod_otherClass(); // object

		objPayment.getPayment(); // getPayment method
		System.out.println(objPayment.getEmpInfo()); // getEmp Info method

	}

}
