import java.util.Scanner;

public class TheRedCrossWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = 0, sum = 0, noOfCamp;

		noOfCamp = sc.nextInt();
		int[] refugees = new int[noOfCamp];
		while (i < refugees.length) {
			refugees[i] = sc.nextInt();
			sum = sum + refugees[i];
			i++;
		}
		sc.close();
		System.out.println(sum);
	}

}
