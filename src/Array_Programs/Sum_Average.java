package Array_Programs;
import java.util.Scanner;
public class Sum_Average {

	public static void main(String[] args) {
		int n, sum =0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all elements:");
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
			sum = sum +a[i];
		}
		System.out.println("SUm:"+sum);
		average = (float)sum/n;
		System.out.println("Average:"+average);

	}

}
