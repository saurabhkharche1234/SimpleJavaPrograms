package Strings;
import java.util.Scanner;
public class String_Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a,b = "";
		System.out.println("Enter a string: ");
		a = sc.nextLine();
		int n = a.length();
		
		for(int i = n-1;i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println(a+" is a Pallindrome");
		}
		else
		{
			System.out.println(a+ " is not a Pallindrome");
		}

	}

}
