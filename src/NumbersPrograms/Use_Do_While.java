//program to reverse a number and find its sum using do-while loop

package NumbersPrograms;
import java.util.Scanner;
public class Use_Do_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,m=0,sum=0;
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		do
		{
			a = n %10;
			m = m*10 +a;
			sum = sum + a;
			n = n/10;
		}
		while(n>0);
			System.out.println("Reverse: "+m);
			System.out.println("Sum of digits: "+sum);
	}

}
