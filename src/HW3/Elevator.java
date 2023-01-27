package HW3;

public class Elevator {
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor){
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	if(current_Floor == dest_Floor) {
		arrive_atFloor();
		exit();
	}
	while(current_Floor!=dest_Floor) {
	
		if (current_Floor < dest_floor) {
			go_up();
		}
		else if(current_Floor > dest_Floor) {
			go_down();
		}
	}
	arrive_atFloor();
	exit();
	}
	

	private void arrive_atFloor() {
		State.Current_State=State.Idle;
		System.out.println("Arrived at destination");
	}
	
	private void go_up() {
		State.Current_State=State.Moving_up;
		System.out.println("Moving up");
		current_Floor++;
		System.out.println("Arrived at " + current_Floor);
	}
	 
	private void go_down() {
		State.Current_State=State.Moving_down;
		System.out.println("Moving down");
		current_Floor--;
		System.out.println("Arrived at " + current_Floor);
	}
	
	private void exit() {
		System.out.println("Exit");
	}
	
}
