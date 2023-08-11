//stack is LIFO structured, here we use push pop and peek functions which are pre-defined
//in this program we will implement how to reverse the stack and how to push an element at bottom
// to check the output of push at bottom comment reverse function
package collection_Examples;
import java.util.*;
public class StackClass {

	public static void pushAtBottom(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		
		int top = s.pop();
		
		pushAtBottom(data,s);
		s.push(top);
	}
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		
		int top = s.pop();
		reverse(s);
		pushAtBottom(top, s);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(1);  //first position
		s.push(2);
		s.push(3);   //in output it will show 3-2-1 as stack follows LIFO 
		pushAtBottom(4,s);
		
		reverse(s);    //to check the output of push at bottom comment this line
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}

	}

}
