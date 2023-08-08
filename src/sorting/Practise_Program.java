//bubble sort practise

package sorting;
import java.util.Scanner;



public class Practise_Program {

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
			
		int arr[] = {5,6,2,8,4};
	
		//insertion sort
		
		for(int i =1; i<arr.length; i++)
		{
			int current = arr[i];
			int j = i-1;
			for(; j>=0 && current< arr[j];j--)
			{
				arr[j+1] = arr[j];
			}
			
			//placement
			
			arr[j+1] = current;
		}
		
		
		printArray(arr);
		}
}