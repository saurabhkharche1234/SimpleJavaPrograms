//in quick sort we use pivot and partition technique most preferable way to do quick sort is to set last array item as pivot
//to be used when we have average cases and we need to use low memory
//time complexity worst = O(n^2) and average time complexity is O(nlogn)
//worst case occurs when pivot is always smallest or largest element

package dataStructures;

public class QuickSort {
	
	public static int partition(int arr[],int low, int high) {
		int pivot = arr[high];
		int i= low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		
		//swap for pivot position
		int temp = arr[i];  //to temporary store value bigger than pivot
		arr[i] = pivot;   //moving pivot to its actual position
		arr[high] =temp; //moving values bigger than pivot after pivot position in array
		return i;  //pivot
		
	}
	
	public static void quickSort(int arr[],int low, int high) {
		
		if(low<high) {
			int pidx = partition(arr,low,high);
			
			quickSort(arr,low,pidx-1);
			quickSort(arr,pidx+1,high);
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		int n = arr.length;
		
	quickSort(arr,0,n-1);
	
	//print
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}

}
