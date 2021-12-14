import java.util.Arrays;
import java.util.Scanner;

public class NamesSorting {
	public void namesort() {
		Scanner sc =new Scanner(System.in);
		int tempValue;
		
		System.out.println("Enter number of array elements: ");
		int size=sc.nextInt();
		
		String[] nameArray=new String[size];
		for (int i=0;i<size;i++) {
			System.out.println("Enter element: ");
			nameArray[i]=sc.next();	
			}
		System.out.println("Entered values: ");
		for(int i=0;i<size-1;i++) {
			System.out.print(nameArray[i]+",");
			}
		System.out.println(nameArray[nameArray.length-1]);
		Arrays.sort(nameArray);
		
		System.out.println("Sorted Names Array: ");
		for(int i=0; i<size-1;i++) {
			System.out.print(nameArray[i]+",");
		}
		System.out.println(nameArray[nameArray.length-1]);
	}

}
