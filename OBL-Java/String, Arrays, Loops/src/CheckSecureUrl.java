import java.util.Scanner;

public class CheckSecureUrl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String url, start;

		System.out.println("Enter the String");
		url = sc.nextLine();

		System.out.println("Enter the start string");
		start = sc.nextLine();

		sc.close();
		
		boolean b = url.regionMatches(true, 0, start, 0, start.length());

		if (b)
			System.out.println("\"" + url + "\" does start with \"" + start + "\"");
		else
			System.out.println(url + " does not start with \"" + start + "\"");

	}

}
