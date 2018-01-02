package Normal;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            primeValidator(ele);
        }
	}

	private static void primeValidator(int ele) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2; i<ele/2; i++){
			if(ele%i == 0){
				count++; 
			}
		}
		if(count == 0){
			System.out.println("PRIME");
		}else{
			System.out.println("NOT PRIME");
		}
	}
}
