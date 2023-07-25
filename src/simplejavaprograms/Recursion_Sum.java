//program to sum of the digits in a number using recursion
package simplejavaprograms;
import java.util.Scanner;
public class Recursion_Sum {

		int sum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Recursion_Sum obj = new Recursion_Sum();
		int a = obj.add(n);
		System.out.println("Sum:"+a);

	}
	int add(int n)
	{
		sum = n%10;
		if(n==0)
		{
			return 0;
		}
		else 
		{
			return(sum+add(n/10));
		}
	}

}
