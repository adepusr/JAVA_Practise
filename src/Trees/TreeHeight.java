package Trees;

import java.util.Scanner;

public class TreeHeight {
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println("\n TRAVERSEING ");
        //traverse(root);
        levelOrder(root);
        System.out.println(height);
    }
	 private static void levelOrder(Node root){
	      //Write your code here
		 int height= getHeight(root);
		 for(int i=1; i<= height+1; i++){
		      printLevelorder(root, i);
			 
		 }
	    }
	private static void printLevelorder(Node root, int height) {
		// TODO Auto-generated method stub
		if(root == null){
			return ;
		}else{
			if(height == 1){
				System.out.println(root.data+" .");
			}else{
				printLevelorder(root.left,height-1);
				printLevelorder(root.right,height-1);					
			}
		}
	}
	private static void traverse(Node root) {
		// TODO Auto-generated method stub
		if(root != null){
			System.out.println(root.data);
			traverse(root.left);
			traverse(root.right);
		}
	}
	private static int getHeight(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return -1;
		}else{
			return 1+Math.max(getHeight(root.left), getHeight(root.right));
		}
	}
}