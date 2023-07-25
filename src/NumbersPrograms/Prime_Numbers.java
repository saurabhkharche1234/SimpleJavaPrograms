//Program to find series of prime number in given range

package NumbersPrograms;
import java.util.Scanner;
public class Prime_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,flag =0,i,j;
		System.out.println("Enter the lower limit");
		s1 = sc.nextInt();
		System.out.println("Enter the upper limit");
		s2 = sc.nextInt();
		System.out.println("The prime numbers in between the entered series are:");
		for(i=s1;i<=s2;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
				{
					flag =1;
				}
					
			}
			if(flag==1)
				System.out.println(i);
		}

	}

}
