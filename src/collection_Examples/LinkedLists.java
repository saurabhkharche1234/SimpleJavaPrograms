package collection_Examples;
import java.util.LinkedList;
public class LinkedLists {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("This");
		
		list.add("is");
		
		list.addFirst("beforethis");
		
		list.add("after is");
		
		System.out.println(list);
		
		list.removeLast();
		
		list.removeFirst();
		
		list.remove();
		System.out.println(list);
		System.out.println(list.size());

	}

}
