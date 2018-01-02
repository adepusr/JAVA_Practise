package commonHealth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLogic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Elevator> li= new ArrayList<Elevator>();
		/* Initializing Lifts with default settings 
		 * Floor number of lift is 2
		 * Working status is True
		 * Lift number is 1, 2, 3, 4, 5, 6*/ 
		for(int i=0; i< 6; i++){
			Elevator e1 =new Elevator();
			e1.setFloor(2);
			e1.setLift_number(i+1);
			e1.setStatus(true);
			li.add(e1);
		}
		/*Choose 1 for entering to maintainence mode to configure the failed lifts and enters to User mode after successfull configuration*/
		System.out.println("1. ENTER MAINTAINACE MODE");
		/* Choose 2 for usermode */
		System.out.println("2. ENTER USER MODE\n\n");
		System.out.println("ENTER OPTION: ");
		Scanner sc1= new Scanner(System.in);
		int mode= sc1.nextInt();
		if(mode == 1){
			/* Lift numbers given in following format 1,2,3,4,5,6 */
			System.out.println("Enter not working lift numbers( 1 - 6 ) seperated by comma: ");
			Scanner sc2= new Scanner(System.in);
			String failed= sc2.nextLine();
			String arr[]= failed.split(",");
			for(int i=0; i< arr.length; i++){	
				if(Integer.parseInt(arr[i]) >= 1 && Integer.parseInt(arr[i]) <= 6)
					// Lift matching with given lift number is marked as failed. 
					li.get(Integer.parseInt(arr[i])-1).setStatus(false);
				else{
					System.out.print("Invalid lift number "+ (Integer.parseInt(arr[i])-1));
				}
			}			
			System.out.println("Configured successfully ENTERED INTO USER MODE: ");
			userMode(li);
		}else{
			userMode(li);
		}
	}

	private static void userMode(List<Elevator> li) {
		// TODO Auto-generated method stub
		System.out.print("Let Time taken by elevator from one floor to its adjacent is 10 Seconds\n\n");
		while(true){	
			System.out.println("Enter Floor: " );
			// Accepted lift numbers is 2 to 19.
			Scanner sc= new Scanner(System.in);
			int floor= sc.nextInt();
			int distance, nextdist, liftnumb = 1;
			String direction="up";
			/*There are two ways in implementing this logic 
			 * one way is to check weather elevator is working or not and then looking for nearest one, 
			 * the second way is checking for nearest elevator and then verifying its working state.
			 * Although time complexity (O(n)) is same for both ways,they vary in space complexity due to extra operations involved in second approach. 
			 * Because of these constraints I have selected first approach.  
			*/
			if(floor >=2 && floor <= 19){
				distance=19;
				for(int i=0; i<6; i++ ){
					if(li.get(i).isStatus()){
								nextdist = Math.abs(li.get(i).getFloor()- floor);
								if(nextdist < distance){
									distance= nextdist;
									liftnumb= i;
									direction = (li.get(i).getFloor()- floor) >0 ? "down":"up";									
								}
							}
				}
				if(distance ==0){
						direction = "open";
						System.out.println("Elevator "+ (liftnumb+1) +" is ready to "+ direction +" takes "+distance*10 +" seconds");
				}else{
					System.out.println("Elevator "+ (liftnumb+1) +" is comming "+ direction +" takes "+distance*10 +" seconds to reach you");
				}
				li.get(liftnumb).setFloor(floor);
				System.out.println(li.get(0).getFloor() +" "+ li.get(1).getFloor() +" "+li.get(2).getFloor() +" "+li.get(3).getFloor() +" "+li.get(4).getFloor() +" "+li.get(5).getFloor() +" " );
			}
		}
	}
}
