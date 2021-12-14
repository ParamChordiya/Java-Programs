//16.08.2021
//EXP1 
import java.util.Scanner;
public class SumAndAvg {

	public void sumAndAvg() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER N: ");
		
		int n=s.nextInt();
		int i,sum=0;
		
		for(i=0;i<=n;i++) {
			sum=sum+i;
		}
		float avg=0;
		avg=sum/n;
		
		System.out.println("THE SUM IS: "+sum);
		System.out.println("AVG IS: "+avg);

	}

}
