import java.util.Scanner;

public class ProfitPercentage {

	public static void main (String args[]){

	float dozensPurchased, costPerDozen, sellingPrice, costPerToy, profit, profitPercent;
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the number of dozens of toys purchased");
	dozensPurchased = s.nextFloat();

	System.out.println("Enter the price per dozen");
	costPerDozen = s.nextFloat();

	System.out.println("Enter the selling price of 1 toy");
	sellingPrice= s.nextFloat();

	costPerToy = costPerDozen / 12;
	profit = sellingPrice - costPerToy;
	profitPercent = (profit / costPerToy) * 100;

	System.out.printf("Sam's profit percentage is %.2f percent", profitPercent);
	
	}

}