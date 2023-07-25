//program to print Floyd's Triangle
package Patterns;
import java.util.Scanner;
public class Floyd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, num=1;
		System.out.println("Enter the number of rows");
		n = sc.nextInt();
		System.out.println("The Floyd's Triangle is:");
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
