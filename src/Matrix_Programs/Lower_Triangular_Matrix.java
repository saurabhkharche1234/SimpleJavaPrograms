package Matrix_Programs;
import java.util.Scanner;
public class Lower_Triangular_Matrix {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of your matrix");
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		System.out.println("Enter the number of columns");
		int m = sc.nextInt();
		
		if(n==m)
		{
			System.out.println("Enter your matrix row wise");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j] = sc.nextInt();
					System.out.print(" ");
				}
			}
			System.out.println("The matrix you have entered is:");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
					
				}
				System.out.println("");
			}
			
			System.out.println("The Lower Triangular matrix is:");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i>=j)
					{
						System.out.print(a[i][j]+" ");
					}
					else
					{
						System.out.print("0" + " ");
					}
				}
				System.out.println("");
			}
		}
		else 
		{
			System.out.println("You have entered improper order");
		}
		
	}

}
