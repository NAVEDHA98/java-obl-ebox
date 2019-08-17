import java.util.ArrayList;
import java.util.Scanner;

class Player {
	private String name, country, skill;

	public Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s", name, country, skill);
	}

}

class PlayerBO {

	void displayAllPlayerDetails(ArrayList<Player> playerList) {
		System.out.println("\nPlayer Details");
		for (Player p1 : playerList) {
			System.out.println(p1.toString());
		}
	}
}

public class PlayerDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int n = new Integer(sc.nextLine());

		ArrayList<Player> playerList = new ArrayList<Player>(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the player name");
			String name = sc.nextLine();

			System.out.println("Enter the country name");
			String country = sc.nextLine();

			System.out.println("Enter the skill");
			String skill = sc.nextLine();

			Player p = new Player(name, country, skill);
			playerList.add(p);
		}
		PlayerBO pbo = new PlayerBO();
		pbo.displayAllPlayerDetails(playerList);
		sc.close();
	}
}