//this program is to find the largest of entered three numbers

package simplejavaprograms;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		System.out.println("Enter third number");
		int z = sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("largest number is "+x);
		}
		else if(y>z) {
			System.out.println("the largest number is "+y);
		}
		else 
			System.out.println("the largest number is "+z);
}

}
