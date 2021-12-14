import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		double num1, num2,result;
		Scanner input =new Scanner(System.in);
		System.out.println("Choose an operator: +,-,*,/,!");
		operator=input.next().charAt(0);
		
		System.out.println("ENTER FIRST NUMBER: ");
		num1=input.nextDouble();
		System.out.println("ENTER SECOND NUMBER: ");
		num2=input.nextDouble();
		
		Add a=new Add();
		Subtract sub=new Subtract();
		Multiply mul=new Multiply();
		Division d=new Division();
		
		switch(operator) {
		case '+':
			
			a.add(num1,num2);
			break;
		case '-':
			
			sub.sub(num1,num2);
			break;
		case '*':
			
			mul.mul(num1,num2);
			break;
		case '/':
			
			d.div(num1,num2);
			break;
		
			
		}

	}

}
