package suma;

import java.util.Scanner;

public class TwoDimension {

	public static void main(String[] args) {
		int a[][];
		int n,m;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		m=sc.nextInt();
		System.out.println("Enter number of columns");
		n=sc.nextInt();
		
		a=new int[m][n];
		System.out.println("Enter the matrix");
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<n;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		System.out.println("Entered Array is");
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<n;c++)
			{
			System.out.print(a[r][c] +" ");
			}
			System.out.println();
		}

	}

}
