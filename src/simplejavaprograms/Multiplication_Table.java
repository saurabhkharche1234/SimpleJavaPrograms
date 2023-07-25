//Prog to get multiplication table

package simplejavaprograms;
import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
