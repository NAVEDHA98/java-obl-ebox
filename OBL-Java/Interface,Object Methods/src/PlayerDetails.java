import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}

abstract class Player {
	protected String name, teamName, noOfMatches;

	public Player(String name, String teamName, String noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}

}

class CricketPlayer extends Player implements IPlayerStatistics {

	private String totalRunsScored, noOfWicketsTaken;

	public CricketPlayer(String name, String teamName, String noOfMatches, String totalRunsScored,
			String noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}

	@Override
	public void displayPlayerStatistics() {
		System.out.println(
				"Player Details\nPlayer name: " + name + "\nTeam name: " + teamName + "\nNo of matches: " + noOfMatches
						+ "\nTotal runs scored: " + totalRunsScored + "\nNo of wickets taken: " + noOfWicketsTaken);
	}

}

class HockeyPlayer extends Player implements IPlayerStatistics {
	private String position, noOfGoals;

	public HockeyPlayer(String name, String teamName, String noOfMatches, String position, String noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}

	@Override
	public void displayPlayerStatistics() {
		System.out.println("Player Details\nPlayer name: " + name + "\nTeam name: " + teamName + "\nNo of matches: "
				+ noOfMatches + "\nPosition: " + position + "\nNo of goals taken: " + noOfGoals);
	}

}

public class PlayerDetails {

	public static void main(String[] args) {
		int displayChoice;
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Cricket Player Details\n2.Hockey Player Details\nEnter choice");
		displayChoice = new Integer(sc.nextLine());

		switch (displayChoice) {
		case 1:
			System.out.println("Enter player name");
			String name = sc.nextLine();
			System.out.println("Enter team name");
			String teamName = sc.nextLine();
			System.out.println("Enter the number of matches played");
			String noOfMatches = sc.nextLine();
			System.out.println("Enter total runs scored");
			String totalRunsScored = sc.nextLine();
			System.out.println("Enter total number of wickets taken");
			String noOfWicketsTaken = sc.nextLine();
			IPlayerStatistics ips = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
			ips.displayPlayerStatistics();
			break;
		case 2:
			System.out.println("Enter player name");
			String name1 = sc.nextLine();
			System.out.println("Enter team name");
			String teamName1 = sc.nextLine();
			System.out.println("Enter the number of matches played");
			String noOfMatches1 = sc.nextLine();
			System.out.println("Enter the position");
			String position = sc.nextLine();
			System.out.println("Enter total number of goals taken");
			String noOfGoalsTaken = sc.nextLine();
			ips = new HockeyPlayer(name1, teamName1, noOfMatches1, position, noOfGoalsTaken);
			ips.displayPlayerStatistics();
			break;
		default:
			System.out.println("Please try again...");
			break;
		}

		sc.close();
	}

}
