package Normal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NestedLogic {

	public static void main(String[] args) throws ParseException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String date1= sc.nextLine();
        String date2= sc.nextLine();
        feeCalculator(date1, date2);    
    }

	private static void feeCalculator(String date1, String date2) throws ParseException {
		// TODO Auto-generated method stub
		String[] date_1 = date1.split(" ");
		int d1 = Integer.parseInt(date_1[0]);
		int m1 = Integer.parseInt(date_1[1]);
		int y1 = Integer.parseInt(date_1[2]);
		String[] date_2 = date2.split(" ");
		int d2 = Integer.parseInt(date_2[0]);
		int m2 = Integer.parseInt(date_2[1]);
		int y2 = Integer.parseInt(date_2[2]);
		if(y1 <y2){
			System.out.println("0");
		}else{
			if(m1 <m2){
				System.out.println("0");				
			}else{
				if(d1 <d2){
					System.out.println("0");
				}else{
					int fee= 15* ((d1-d2)+ (m1-m2)*30+(int)(m1-m2)%2+ (y1-y2)*365);
					System.out.println(fee);	
				}
			}			
		}
	}

}
