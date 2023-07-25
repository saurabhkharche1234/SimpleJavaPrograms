package Matrix_Programs;
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		System.out.println("Enter the elements in matrix:");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j] = sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The matrix entered is:");
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Transpose of above matrix is:");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
