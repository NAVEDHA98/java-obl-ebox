import java.util.Scanner;

class InvalidAgeException extends Exception {

	int age;

	public InvalidAgeException(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Exception occured: InvalidAgeException: not valid";
	}

}

public class AgeValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your age");
			int age = sc.nextInt();

			if (age < 18) {
				throw new InvalidAgeException(age);
			}
			System.out.println("welcome to vote");
		} catch (InvalidAgeException iae) {
			System.out.println(iae);
		} finally {
			sc.close();
		}
	}
}

