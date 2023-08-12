//BST = binary search tree
//features: 1. left subtree nodes<root  2. right subtree nodes >root 3. left and right subtrees are also BST with no duplicates
//time complexity O(H)
//BST makes search efficient
// delete a node
//print in range


package dataStructures;

public class BinarySearchTreeImplementation {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		
		if(root.data > val) {
			root.left = insert(root.left, val);
		}else {
			 root.right = insert(root.right,val);
		}
		return root;
	}
	
	public static void inOrder(Node root) {
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
		
	}
	
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		
		if(root.data> key) {
				return search(root.left,key);  //left subtree
			}else if(root.data==key) {
				return true;
		}else {
			return search(root.right,key);
		}
		
	}
	
	//deleting a node
	
	public static Node delete(Node root,int val) {
		if(root.data>val) {
			root.left = delete(root.left,val);
		}else if(root.data<val) {
				root.right = delete(root.right, val);
			}else {   //condiotion where root.data == val
					  //case1:
					if(root.left==null && root.right == null) {
						return null;
					}//case 2:
					
					if(root.left==null) {
						return root.right;
					}else if(root.right==null) {
							return root.left;
					}
					 //case 3:
					Node IS = inorderSuccessor(root.right);
					root.data = IS.data;
					delete(root.right, IS.data);
					
				
				}
		return root;
	}
	
	public static Node inorderSuccessor(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	public static void printInRange(Node root, int x, int y) {
		if(root == null) {
			return;
		}
		if(root.data >=x && root.data <= y) {
			printInRange(root.left, x, y);
		    System.out.print(root.data+" ");
		    printInRange(root.right, x, y);
		}else if(root.data>=y) {
				printInRange(root.left, x, y);
			}else {
				 	printInRange(root.right, x, y);
			}
		
	}
	
	public static void main(String[] args) {
		int values[] = {5,1,3,4,2,7};
		Node root = null;
		
		for(int i=0;i<values.length; i++) {
			root = insert(root, values[i]);
		}
		inOrder(root);
		System.out.println();
		
//		if(search(root,1)) {
//			System.out.println("result found");
//		}else {
//			System.out.println("result not found");
//		}
//		
//		delete(root, 1);
//		inOrder(root);
		
		printInRange(root, 3, 6);
	}

}
