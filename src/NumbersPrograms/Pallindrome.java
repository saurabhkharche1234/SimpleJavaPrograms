//Program to check whether the entered number is pallindrome or not

package NumbersPrograms;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m, rev = 0,x;
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		m=n;
		
		while(n>0)
		{
			x = n %10;
			rev = rev *10+ x;
			n = n/10;
		}
		if(rev ==m)
		{
			System.out.println(" "+m+" is a pallindrome number");
		}
		else
			System.out.println("Entered number is not pallindrome number");
		
	}

}
