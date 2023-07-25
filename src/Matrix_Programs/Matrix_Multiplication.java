package Matrix_Programs;
import java.util.Scanner;
public class Matrix_Multiplication {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the base of sqaured matrix");
	int n = sc.nextInt();
	
	int[][] a = new int[n][n];
	int[][] b = new int[n][n];
	int[][]c = new int [n][n];
	
	System.out.println("Enter the elements of 1st matrix row wise");
	for(int i = 0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Enter the elements of 2nd matrix row wise");
	for(int i = 0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			b[i][j]= sc.nextInt();
		}
	}
	
	//Matrix multiplication
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				c[i][j] = c[i][j] + a[i][k]*b[k][j];
			}
		}
	}
	
	System.out.println("Matrix Multiplication is:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(c[i][j]+ " ");
		}
		System.out.println();
	}
	sc.close();	
	
	}

}
