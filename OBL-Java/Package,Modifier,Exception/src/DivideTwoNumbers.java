import java.util.Scanner;

public class DivideTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Enter the 2 numbers");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.printf("The quotient of %d/%d = %d\n", number1, number2, number1 / number2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("DivideByZeroException caught");
		} 
		finally 
		{
			System.out.println("Inside finally block");
		}
	}
}

