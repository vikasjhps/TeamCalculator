
public class Division implements ArithmeticOperations{

	public double evaluate(double op1, double op2) {
		double result = 0;
		try {
			result = op1/op2;
		}
		catch(Exception e){
			System.out.println("Divided by Zero");
		}
		
		return result;
	}

}
