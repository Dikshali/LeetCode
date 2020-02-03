package github;
/**
 * 
 * @author diksh
 * Binary Search Tree basic operations
 * insert a value/node
 * delete a node
 * search a node
 * pre-order, in-order, post-order traversal
 */
public class BSTOperations {
	
	public static void main(String args[]) {
		TreeNode head = null;
		head = insertNode(head, 44);
		head = insertNode(head, 17);
		head = insertNode(head, 88);
		head = insertNode(head, 32);
		head = insertNode(head, 65);
		head = insertNode(head, 97);
		head = insertNode(head, 28);
		head = insertNode(head, 29);
		head = insertNode(head, 54);
		head = insertNode(head, 82);
		head = insertNode(head, 76);
		head = insertNode(head, 80);
		head = insertNode(head, 78);
		System.out.println("--------PreOrder-------");
		preOrderTraversal(head);
		System.out.println();
		System.out.println();
		System.out.println("--------InOrder-------");
		inOrderTraversal(head);
		System.out.println();
		System.out.println();
		System.out.println("--------PostOrder-------");
		postOrderTraversal(head);
		
		head = deleteNode(head, 32);
		System.out.println();
		System.out.println("------Delete 32--------InOrder-------");
		inOrderTraversal(head);
		
		head = deleteNode(head, 65);
		System.out.println();
		System.out.println("------Delete 65--------InOrder-------");
		inOrderTraversal(head);
		/*head = insertNode(head, 10);
		head = insertNode(head, 5);
		head = insertNode(head, 2);
		head = insertNode(head, 6);
		head = insertNode(head, 16);
		head = insertNode(head, 12);
		head = insertNode(head, 20);
		System.out.println("--------PreOrder-------");
		preOrderTraversal(head);
		System.out.println();
		System.out.println();
		System.out.println("--------InOrder-------");
		inOrderTraversal(head);
		System.out.println();
		System.out.println();
		System.out.println("--------PostOrder-------");
		postOrderTraversal(head);
		
		System.out.println();
		System.out.println("20: "+ searchNode(head, 20));
		System.out.println("14: "+ searchNode(head, 14));
		
		head = deleteNode(head, 20);
		System.out.println();
		System.out.println("------Delete 20--------InOrder-------");
		inOrderTraversal(head);
		
		head = deleteNode(head, 5);
		System.out.println();
		System.out.println("------Delete 5--------InOrder-------");
		inOrderTraversal(head);
		
		head = deleteNode(head, 16);
		System.out.println();
		System.out.println("------Delete 16--------InOrder-------");
		inOrderTraversal(head);*/
		
		
	}
	
	public static TreeNode deleteNode(TreeNode root, int x) {
		if(root==null) {
			return null;
		}
		if(root.value > x) {
			root.left = deleteNode(root.left, x);
		}else if(root.value < x){
			root.right = deleteNode(root.right, x);
		}else {
			if(root.left==null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}
			
			TreeNode minNode = findMinNode(root.right);
			root.value = minNode.value;
			root.right = deleteNode(root.right, minNode.value);
		}
		return root;		
	}
	
	
	public static TreeNode findMinNode(TreeNode root) {
		//int min = root.value;
		while(root.left!=null) {
			return findMinNode(root.left);
		}
		return root;
	}
	
	public static boolean searchNode(TreeNode root, int x) {
		if(root!=null) {
			if(root.value==x) {
				return true;
			}else if(root.value<x) {
				return searchNode(root.right, x);
			}else {
				return searchNode(root.left, x);
			}
		}
		return false;
	}
	
	public static TreeNode insertNode(TreeNode root, int x) {
		if(root == null) 
			return new TreeNode(x);
		
		if(root.value >= x) {
			root.left = insertNode(root.left, x);
		}else {
			root.right = insertNode(root.right, x);
		}
		return root;
	}
	
	public static void preOrderTraversal(TreeNode root) {
		while(root!=null) {
			System.out.print(root.value+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			root = null;
		}
	}
	
	public static void inOrderTraversal(TreeNode root) {
		while(root!=null) {
			inOrderTraversal(root.left);
			System.out.print(root.value+" ");
			inOrderTraversal(root.right);
			root=null;
		}
	}
	public static void postOrderTraversal(TreeNode root) {
		while(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.value+" ");
			root = null;
		}
	}

}
