//in this program we will get to know how linked list class is created to add or delete elements. In java we already have these classes here we are understanding the implementation of the same

package collection_Examples;

public class LL {
	Node head;
	private int size;
	
	class Node{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data = data;
			this.next = null;
			size++;
		}

}
	
	//add - first and last
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;	
		}
		
		currNode.next = newNode;
	}
	
	//print 
	
	public void printList()
	{
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		
		while(currNode != null) {
			System.out.print(currNode.data+" --> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	
	//delete first

	public void deleteFirst() {
			if(head ==null) {
				System.out.println("Empty List");
				return;
			}
			size--;
			head = head.next;
		
	}
	
	//delete last
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		
		size--;
		if(head.next==null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void reverseList() {
		if(head ==null || head.next == null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode!=null) {
			Node nextNode = currNode.next;
			
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
		
	public static Node reverseRecursive(Node head){
		if(head==null||head.next==null) {
			return head;
		}
		
		Node newhead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newhead;
		
	}
	public static void main(String[] args) {
		LL list = new LL();
		
		list.addFirst("a");
		list.addFirst("is");
		
		list.addLast("list");
		list.printList();
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		
		list.reverseList();
		list.printList();
		
		list.head = reverseRecursive(list.head);
		list.printList();
		
}
}

