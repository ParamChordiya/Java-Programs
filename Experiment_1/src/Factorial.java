
//16.08.2021
//EXP1 
import java.util.Scanner;

public class Factorial {
	

	public void factorial() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		long num=in.nextLong();
		int i,fact=1;
		for(i=1;i<num+1;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of  number is "+fact);
		

	}

}
