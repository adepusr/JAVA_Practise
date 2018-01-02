package ArraysQueues;
import java.util.Scanner;

public class Stack_QueueArrays {
		public static char stack[];
		public static char queue[];
		int top= -1,r=-1, f=-1;
		Stack_QueueArrays(){
			stack=new char[10];
			queue= new char[10];
		}
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        Stack_QueueArrays p = new Stack_QueueArrays();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	           // p.pushCharacter(c);
		        // p.display();
	           p.enqueueCharacter(c);
	        }
	       // p.popCharacter();
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	        System.out.print(p.deQueue());
	       // p.display();
	        
	    }
		private char deQueue() {
			// TODO Auto-generated method stub
			System.out.println(r+"  "+f);
			if(f == -1 || (f == r+1)){
				System.out.println("Empty");
			}else{
				return queue[f++];
			}
			return 0;
		}
		private void enqueueCharacter(char c) {
			// TODO Auto-generated method stub
			if(r<9){
				System.out.println(r+"  "+f);
				if(r == -1 || f==-1){
					f++;
				}
				r++;
				queue[r]=c;
			}else{
				System.out.print("FULL");				
			}
		}
		private void pushCharacter(char c) {
			// TODO Auto-generated method stub
			if(top <9){
				top++;
				stack[top]= c;
			}else{
				System.out.println("FULL\n");
			}
		}
		private char popCharacter() {
			// TODO Auto-generated method stub
			
			if(top >-1 && top<= 9){
				return stack[top--];
			}	
			else{
				System.out.println("STACK IS EMPTY\n");
				return ' ';
			}
		}
		private void display(){
			if(top>-1){
				for(int i=0;i<=top; i++){
					System.out.print(stack[i]);
				}
				System.out.println('\n');
			}
		}
}
