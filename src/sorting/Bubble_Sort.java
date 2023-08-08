//in bubble sort we move heavier elements i.e. bigger elements to the end of array comparing them with all other elements present in array
// time complexity is O(n^2)
//in bubble sort we keep on swapping elements every time.

package sorting;
import java.util.*;
public class Bubble_Sort {
	
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();

	}

	public static void main(String[] args) {
		 int arr[] = {7, 8, 1, 3, 2};


	       //bubble sort
	       for(int i=0; i<arr.length-1; i++) {
	           for(int j=0; j<arr.length-i-1; j++) {
	               if(arr[j] > arr[j+1]) {
	                   
	            	   //swap
	                   int temp = arr[j];
	                   arr[j] = arr[j+1];
	                   arr[j+1] = temp;
	               }
	           }
	       }


	       printArray(arr);
	   }
}


