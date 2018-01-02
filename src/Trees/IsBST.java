package Trees;

import java.util.Scanner;

public class IsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node tree= new Node(4);
	        tree.left = new Node(2);
	        tree.right = new Node(5);
	        tree.left.left = new Node(1);
	        tree.left.right = new Node(3);
		  System.out.println(isBST(tree));
	}

	private static boolean isBST(Node n) {
		// TODO Auto-generated method stub
		return isBSTChecking(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBSTChecking(Node n, int min, int max) {
		// TODO Auto-generated method stub
		if(n == null){
			return true;
		}else{
			if(n.data < min || n.data > max){
				return false;
			}
			System.out.println(n.left +" = "+ min +" = "+ (n.data-1));
			System.out.println(n.right +" = "+(n.data+1)+" = "+max);
			return isBSTChecking(n.left, min, n.data-1) && isBSTChecking(n.right, n.data+1, max); 
		}
	}
}
