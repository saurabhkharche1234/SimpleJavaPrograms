//in insertion sort we divide array in two parts: Sorted part and unsorted part and then we place elements from unsorted part into sorted part to its right position 
// time complexity: O(n^2)

package sorting;

public class Insertion_Sort {
	  public static void printArray(int arr[]) {
	       for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	   }


	   public static void main(String args[]) {
	       int arr[] = {7, 8, 1, 3, 2};


	       //insertion sort
	       for(int i=1; i<arr.length; i++) {
	           int current = arr[i];
	           int j = i - 1;
	               while(j >= 0 && arr[j] > current) {
	                
	                   arr[j+1] = arr[j];
	                   j--;
	               }
	               
	               //placement
	           arr[j+1] = current;
	       }
	       printArray(arr);
	   }

	
}
