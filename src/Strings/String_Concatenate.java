package Strings;
import java.util.Scanner;
public class String_Concatenate {

	public static void main(String[] args) {
		String a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		a =sc.nextLine();
		System.out.println("Enter second string: ");
		b = sc.nextLine();
		String_Concatenate obj = new String_Concatenate();
		c = obj.concat(a, b);
		System.out.println("New String is: "+c);
		
	}
	String concat(String x, String y)
	{
		String z;
		z = x + " " + y;
		return z;
	}

}
