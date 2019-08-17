import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day;
		String[] weekDay = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		System.out.println("Enter the day number");
		day = sc.nextInt();

		sc.close();

		for (int i = 0; i < weekDay.length; i++) {
			if (i == (day - 1)) {
				System.out.println(weekDay[i]);
			}
		}
		if (day >= 8 && day <= 0)
			System.out.println("Only 7 days in a week");
	}
}
