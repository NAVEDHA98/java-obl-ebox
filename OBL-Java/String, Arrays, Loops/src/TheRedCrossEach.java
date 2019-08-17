import java.util.Scanner;

public class TheRedCrossEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sum = 0, noOfCamp;

		noOfCamp = sc.nextInt();
		int[] refugees = new int[noOfCamp];
		for (int i1 : refugees) {
			i1 = sc.nextInt();
			sum = sum + i1;
		}
		sc.close();
		System.out.println(sum);
	}

}
