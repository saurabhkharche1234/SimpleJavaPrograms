//we sort array using divide and conquer technique where we keep on dividing the array in half and then combine them
//si = starting index, ei= ending index
//time complexity is O(nlogn)
// to be implemented when we have more memory and even in worst case we want time complexity as O(nlogn)
package sorting;
import java.util.Scanner;
public class Merge_Sort extends Exception {

	public static void conquer(int arr[],int si, int mid, int ei) {   //function to sort
		int merger[] = new int[ei-si+1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <=mid && idx2 <=ei) {
			if(arr[idx1]<=arr[idx2])
			{
				merger[x++] = arr[idx1++];
			}else {
				merger[x++] = arr[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merger[x++] = arr[idx1++];
		}
		
		while(idx2<=ei) {
			merger[x++] = arr[idx2++];
		}
		
		for(int i=0, j = si; i < merger.length;i++,j++) {
			arr[j] = merger[i];
		}
	}
	
	
	public static void divide(int arr[], int si, int ei) {  // recursive function to divide the array entered 
		
		if(si>=ei) {
			return;
		}
		
		int mid = si + (ei-si)/2;  //to divide in half
		
		divide(arr, si, mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			try{
					System.out.println("Enter the number of elements in the list::");
					int n = sc.nextInt();
					int arr[] = new int[n];	
					System.out.println("Enter the elements::");
					for(int i=0;i<n;i++)
						{
						arr[i] = sc.nextInt();
						}
					
					
					divide(arr, 0,n-1);   //passed values where si =0 and ei is n-1
					
					//print
					for(int i=0;i<n;i++) {
						System.out.print(arr[i] +" ");
						}
					
					System.out.println();
					
				}catch(Exception e) {
					System.out.println("Invalid Input Entered.");			
			}
		}
	}
}