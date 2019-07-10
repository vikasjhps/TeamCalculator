import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double op1=sc.nextDouble();
		double op2 = sc.nextDouble();
		String operator = sc.next();
		
		double result=0;
		Addition add=new Addition();
		Subtraction sub= new Subtraction();
		Multiplication mult =new Multiplication();
		Division div =new Division();
		if(operator.equals("+")) 
			result =add.evaluate(op1,op2);
		else if(operator.equals("-")) 
			result =sub.evaluate(op1,op2);
		else if(operator.equals("*")) 
			result =mult.evaluate(op1,op2);
		else if(operator.equals("/")) 
			result =div.evaluate(op1,op2);
		
		
		System.out.println("Result:"+ result);
	}

}
