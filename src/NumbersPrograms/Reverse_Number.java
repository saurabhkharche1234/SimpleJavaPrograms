//Program to reverse the entered number

package NumbersPrograms;
import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,sum =0;
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		while(n>0)
		{
			m = n%10;
			sum = sum * 10 + m;
			n = n/10;
		}
		System.out.println("Reverse of number is "+sum);

	}

}
