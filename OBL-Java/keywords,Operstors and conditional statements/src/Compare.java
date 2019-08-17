import java.util.Scanner;

public class Compare{

	public static void main (String args[]){

	int x, y;
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the first number");
	x = s.nextInt();

	System.out.println("Enter the second number");
	y = s.nextInt();
	
	if(x == y){
		System.out.printf("%d is equal to %d", x, y);
	} else {
		if (x > y)
			System.out.printf("%d is greater than %d", x, y);
		else
			System.out.printf("%d is lesser than %d", x, y);		
		}
	}

}