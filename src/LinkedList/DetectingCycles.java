package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DetectingCycles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n= new Node(5);
		n.next=new Node(6);
		n.next.next=new Node(10);
		n.next.next.next=new Node(5);
		System.out.println(hasCycle(n));
	}
	static boolean hasCycle(Node head) {
	    if (head == null) return false;
	    
	    Node slow = head;
	    Node fast = head.next;
	    while (slow != fast) {
	        if (fast == null || fast.next == null) return false;
	        
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    return true;
	}

}
