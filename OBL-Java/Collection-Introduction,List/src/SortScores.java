import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortScores {

	public static void main(String[] args) {

		int n, temp;
		Scanner sc = new Scanner(System.in);

		n = new Integer(sc.nextLine());
		List<Integer> matchScores = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			matchScores.add(temp);
		}
		Collections.sort(matchScores);

		for (int score : matchScores)
			System.out.println(score);

		sc.close();
	}

}
