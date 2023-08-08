package collection_Examples;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
	//to add elements
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(2);
		list.add(97);
		System.out.println(list);
		
	//to add element in between the array
		
		list.add(1, 19); //1 is the index position and 0 is the element
		System.out.println(list);
		
	//to get the size of arraylist and print the arraylist 
		
		for(int i = 0; i<list.size(); i++)      
		{
			System.out.println(list.get(i));
		}
		
	//to set element 
		list.set(5, 0);
		System.out.println(list);
		
	//to delete the elements
		list.remove(1);
		System.out.println(list);
		
	//to sort the list
		Collections.sort(list);
		System.out.println(list);
	}

}
