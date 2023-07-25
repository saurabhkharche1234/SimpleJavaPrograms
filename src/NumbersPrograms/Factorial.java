//program to find factorial of a number

package NumbersPrograms;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1, n;
		System.out.println("enter the number");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			fact = fact *i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
}

}
