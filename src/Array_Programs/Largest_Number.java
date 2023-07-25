package Array_Programs;
import java.util.Scanner;
public class Largest_Number {

	public static void main(String[] args) {
		int n, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		max = a[0];
		for(int i=0;i<n;i++)
		{
			if(max <a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Maximum value:"+max);
	}

}
