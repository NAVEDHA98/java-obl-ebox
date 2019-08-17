import java.util.Scanner;

public class TheRedCross {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0, noOfCamp;

		noOfCamp = sc.nextInt();
		int[] refugees = new int[noOfCamp];
		for (int i = 0; i < refugees.length; i++) {
			refugees[i] = sc.nextInt();
			sum = sum + refugees[i];
		}
		sc.close();
		System.out.println(sum);

	}

}
