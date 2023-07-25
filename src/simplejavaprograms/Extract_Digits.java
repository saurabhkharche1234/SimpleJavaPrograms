//program to extract the position of digits and the number on the same.

package simplejavaprograms;
import java.util.Scanner;
public class Extract_Digits {

	public static void main(String[] args) {
		int n,m,a, counter =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		m=n;
		while(n>0)
		{
			n = n/10;
			counter++;
		}
		
		while(m>10)
		{
			a = m%10;
			System.out.println("Digits at position "+counter+" : "+a);
			m= m/10;
			counter--;
		}

	}

}
