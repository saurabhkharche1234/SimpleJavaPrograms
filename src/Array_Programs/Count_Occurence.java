package Array_Programs;
import java.util.Scanner;
public class Count_Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x,count =0,i=0;
		System.out.println("Enter the number of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all elements:");
		for(i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to count the number of occurences");
		x = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("number of occurrence of the element:"+count);
	}

}
