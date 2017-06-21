package ttt;

import java.util.LinkedList;

public class test {

	static LinkedList<Integer> li3 =new LinkedList<Integer>();
	public static void sort(LinkedList<Integer> li1,LinkedList<Integer> li2){

		    int i = 0, j = 0, k = 0;

		    while (i < li1.size() && j < li2.size())  
		       li3.add(li1.get(i) < li2.get(j) ? li1.get(i++) :  li2.get(j++));
		    while (i < li1.size())  
		        li3.add(li1.get(i++));

		    while (j < li2.size())    
		        li3.add(li2.get(j++));

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li1 =new LinkedList<Integer>();
		LinkedList<Integer> li2 =new LinkedList<Integer>();
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		sort(li1,li2);
		System.out.println(li3);
	}

}
