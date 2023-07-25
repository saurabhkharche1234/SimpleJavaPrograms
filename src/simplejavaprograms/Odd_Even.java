//This program is to find out whether the number is even or odd

package simplejavaprograms;
import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("This is even number");
		}
		else 
			System.out.println("this is odd number");
	}

}
