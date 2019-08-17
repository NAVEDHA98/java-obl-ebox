import java.util.Scanner;

public class LabAllocation{

	public static void main (String args[]){

	int x, y, z;
	Scanner s = new Scanner(System.in);

	System.out.println("Enter x");
	x = s.nextInt();

	System.out.println("Enter y");
	y = s.nextInt();

	System.out.println("Enter z");
	z = s.nextInt();

	if (x < y && x < z){
			System.out.println("L1 has the minimal seating capacity");
		}else if (y < z) {
			System.out.println("L2 has the minimal seating capacity");
		} else {
			System.out.println("L3 has the minimal seating capacity");
		}		
	
	}

}