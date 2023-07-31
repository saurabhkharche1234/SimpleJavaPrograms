//java program to get the division of two numbers using try and catch
//in the program below if user tries to divide a number by zero then catch will catch an exception and execute the catch block


package ExceptionsBasic;
import java.util.*;
public class Divide_Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		do
		{
			
		try {
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Division of entered numbers is::"+(num1/num2));
		x = 2;
	}
		catch(Exception e) {
		System.out.println("You cannot divide a number by zero");
			//int num1 = 10, num2 = 20;
			//System.out.println("SUm of entered numbers is::"+(num1+num2));
		}
	}while(x==1);
	}
}
