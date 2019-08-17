import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String oldName, newName, content;

		System.out.println("Enter the content of the document");
		content = sc.nextLine();
		
		System.out.println("Enter the old name of the company");
		oldName = sc.nextLine();

		System.out.println("Enter the new name of the company");
		newName = sc.nextLine();

		sc.close();
		
		content = content.replace(oldName, newName);
		System.out.println(content);
		
	}
}
