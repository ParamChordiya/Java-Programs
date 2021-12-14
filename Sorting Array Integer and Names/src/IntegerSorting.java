import java.util.Scanner;
import java.util.Arrays;

public class IntegerSorting {
	public void intsort() {
		Scanner sc =new Scanner(System.in);
		int tempValue;
		
		System.out.println("Enter number of array elements: ");
		int size=sc.nextInt();
		
		int[] numArray=new int[size];
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter element: ");
			numArray[i]=sc.nextInt();		
			}
		System.out.println("Entered values: ");
		for(int i=0;i<size-1;i++) {
			System.out.print(numArray[i]+",");
			}
		System.out.println(numArray[numArray.length-1]);
		
		Arrays.sort(numArray);
		
		/*for (int i=0;i<numArray.length;i++) {
			for (int j=i+1;j<numArray.length;j++) {
				if (numArray[i]>numArray[j]) {
					tempValue=numArray[i];
					numArray[i]=numArray[j];
					numArray[j]=tempValue;
				}
			}
		}*/
		
		System.out.println("Sorted Integer Array: ");
		for(int i=0; i<size-1;i++) {
			System.out.print(numArray[i]+",");
		}
		System.out.println(numArray[numArray.length-1]);
		
	}
	
	}
	

	

