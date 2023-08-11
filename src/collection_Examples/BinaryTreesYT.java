//there are four ways of traversal in binary tree: 
//1. Pre-order traversal: root, left subtree, right subtree
//2. In-order traversal: left subtree, root, right subtree
//3. Post-order traversal: left subtree, right subtree, root
//4. Level order traversal: level-1,2,3..
//also in this program we will be solving few Binary tree problems
//first problem is count of nodes
// 2nd problem sum of nodes
//height of tree
//diameter of binary tree
//diameter and height in one function to reduce time complexity
//isIdentical function to find whether given subtree belong to our main tree or not
//to comment all lines together: shoutcut is: control +/

package collection_Examples;
import java.util.*;
public class BinaryTreesYT {
	 
	static class Node {
		int data;
		Node left;
		Node right;
		public Object val;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree{
		static int idx = -1;
		
		public static Node buildTree(int nodes[]) {
			idx++;
			
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;	
		}
	}
	
	//Pre-order traversal in Binary tree
	//time complexity O(n)
	public static void preOrder(Node root) {
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	//In-order traversal in Binary tree
	//time complexity O(n)
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	//Post-order traversal in Binary tree
	//time complexity O(n)
	public static void postOrder(Node root) {
		if(root==null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	//Level-order traversal in binary tree
	//time complexity O(n)
	public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currNode.data+ " ");
				if(currNode.left!= null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
			}
		}
		
	}
	
	//to count the number of nodes in a binary tree
	//time complexity O(n)
	
	public static int countOfNodes(Node root) {
	 if(root==null) {
		 return 0;
	 }
	 int leftNodes = countOfNodes(root.left);
	 int rightNodes = countOfNodes(root.right);
	 
	 return leftNodes + rightNodes +1;	
	}
	
	//sum of nodes
	//time complexity O(n)
	
	public static int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		
		return leftSum + rightSum + root.data;
	}
	// height of tree
	//time complexity O(n)
	public static int heightOfTree(Node root) {
		if(root== null) {
			return 0;
		}
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		int myHeight = Math.max(leftHeight,  rightHeight) +1;
		
		return myHeight;
		
	}
	
	//to calculate the diameter of binary tree
	//time complexity O(n^2)
	
	public static int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = heightOfTree(root.left)+ heightOfTree(root.right)+1;
		
		return Math.max(Math.max(diam1, diam2), diam3);
		
	}
	
	//to decrease time complexity of diameter of tree we can do following alternate approach where we are counting height and diameter alltogether
	
	static class TreeInfo{
		int ht;
		int diam;
		
		TreeInfo(int ht, int diam) {
			this.ht  = ht;
			this.diam = diam;
		}
	}
		
		public static TreeInfo diameter2(Node root) {
			if(root ==null) {
				return new TreeInfo(0,0);
			}
			
			TreeInfo left = diameter2(root.left);
			TreeInfo right = diameter2(root.right);
			
			int myHeight = Math.max(left.ht, right.ht)+1;
			
			int diam1 = left.diam;
			int diam2 = right.diam;
			
			int diam3 = left.ht + right.ht +1;
			
			int myDiam = Math.max(Math.max(diam1, diam2), diam3);
			
			//TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
			return new TreeInfo(myHeight,myDiam);
		}
		
	/*	public boolean isIdentical(Node root,Node subRoot){
		       if(subRoot == null && root == null){
		           return true;
		       }
		       if(root == null || subRoot == null){
		           return false;
		       }
		       if(root.val == subRoot.val){
		           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		       }
		       return false;
		   }
		  
		   public boolean isSubtree(Node root,Node subRoot) {
		       if(subRoot == null){
		           return true;
		       }
		       if(root == null){
		           return false;
		       }
		       if(isIdentical(root, subRoot)){
		           return true;
		       }
		       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
		   }
*/
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
//		preOrder(root);      
//		inOrder(root);
//		postOrder(root);
//		levelOrder(root);
//		System.out.println(countOfNodes(root));
//		
//		System.out.println(sumOfNodes(root));
//		System.out.println(heightOfTree(root));
//		System.out.println(diameter(root));
//		System.out.println(diameter2(root).diam);	
		
	}
	}