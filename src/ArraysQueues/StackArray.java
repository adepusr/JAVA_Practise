package ArraysQueues;

import java.util.LinkedList;
import java.util.Scanner;

public class StackArray {
//	public char stack[];
//	int top= -1;
//	StackArray(){
//		stack=new char[100];
//	}
	LinkedList<Character> stack;
	LinkedList<Character> queue;
	int top= -1;
	StackArray(){
		stack = new LinkedList<Character>();
		queue= new LinkedList<Character>();
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackArray p = new StackArray();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
        	System.out.println(i);
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	private Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return (char) queue.remove(0);
	}

	private Object popCharacter() {
		// TODO Auto-generated method stub
		return (char)stack.remove(stack.size()-1);
	}

	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		queue.add(c);
	}

	private void pushCharacter(char c) {
		// TODO Auto-generated method stub
		stack.add(c);
	}
}
