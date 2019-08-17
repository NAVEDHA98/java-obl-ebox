import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxScorer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int n = new Integer(sc.nextLine());

		Map<String, Long> hm = new HashMap<>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of player " + (i + 1));
			String name = sc.nextLine();
			Long runs = new Long(sc.nextLine());
			hm.put(name, runs);
		}

		Set s = hm.keySet();
		Long maxRuns = new Long(0);
		String maxName = "!";
		Iterator itr = s.iterator();
		
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			if (maxRuns < hm.get(s1)) {
				maxRuns = hm.get(s1);
				maxName = s1;
			}
		}
		System.out.println(maxName);
	}

}
