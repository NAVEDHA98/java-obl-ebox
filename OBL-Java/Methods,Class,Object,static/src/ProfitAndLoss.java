
import java.util.Scanner;

public class ProfitAndLoss {

	public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {

		float profit, pricePerToy, profitPercent;

		pricePerToy = (float) pricePerDozen / 12;
		profit = (float) sellPrice - pricePerToy;
		profitPercent = (profit / pricePerToy) * 100;

		return profitPercent;
	}

	public static void main(String args[]) {
		int dozenCount, pricePerDozen, sellPrice;
		float profitPercent;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of dozens of toys purchased");
		dozenCount = s.nextInt();

		System.out.println("Enter the price per dozen");
		pricePerDozen = s.nextInt();

		System.out.println("Enter the selling price of 1 toy");
		sellPrice = s.nextInt();

		s.close();

		ProfitAndLoss pal = new ProfitAndLoss();
		profitPercent = pal.calculateProfit(dozenCount, pricePerDozen, sellPrice);

		System.out.printf("Sam's profit percentage is %.2f percent", profitPercent);

	}

}