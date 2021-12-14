import java.util.Scanner;

public class AddMatrices {
	public void addmat() {
		int p,q,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows in 1st Matrix:  ");
		p=sc.nextInt();	
		System.out.print("Enter number of Columns in 1st Matrix:  ");
		q=sc.nextInt();	
		System.out.print("Enter number of rows in 2nd Matrix:  ");
		m=sc.nextInt();	
		System.out.print("Enter number of Columns in 2nd Matrix:  ");
		n=sc.nextInt();	
		
		if(p==m && q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			int c[][]=new int[m][n];
			
			System.out.println("Enter all elements of 1st matrix: ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					a[i][j]=sc.nextInt();	
				}
			}
			
			System.out.println("");
			System.out.println("Enter all elements of 2nd matrix: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("");
			
			System.out.println("First Matrix:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			
			System.out.println("Second Matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println("");
			}
			
			
			for(int i=0;i<p;i++) {
				for(int j=0;j<n;j++) {
					for (int k=0;k<q;k++) {
						c[i][j]=a[i][j]+b[i][j];
					}
				}
			}
			
			System.out.println("Added Matrix Result: ");
			for(int i=0;i<p;i++) {
				for (int j=0;j<n;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("Addition not possible");
		}
		}

}
