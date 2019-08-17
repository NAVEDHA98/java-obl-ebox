import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		int n, total = 0, temp;
		float average;
		Scanner sc = new Scanner(System.in);

		n = new Integer(sc.nextLine());
		List<Integer> matchScores = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			matchScores.add(temp);
			total = total + temp;
		}
		average = ((float) total / (float) n);
		System.out.printf("%d\n%.2f", total, average);

		sc.close();
	}

}

