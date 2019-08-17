import java.util.Scanner;

public class Discount {

	public static void main (String args[]){

	float item1, item2, totalAmount, discountedAmount, savedAmount;
	int discount;
	Scanner s = new Scanner(System.in);

	System.out.println("Price of item 1:");
	item1 = s.nextFloat();

	System.out.println("Price of item 2:");
	item2 = s.nextFloat();

	System.out.println("Discount in percentage");
	discount = s.nextInt();

	totalAmount = item1 + item2;
	discountedAmount= totalAmount - totalAmount * discount / 100;
	savedAmount = totalAmount - discountedAmount;
	
	System.out.printf("Total amount: $%.2f\n", totalAmount);	
	System.out.printf("Discounted amount: $%.2f\n", discountedAmount);
	System.out.printf("Saved amount: $%.2f\n", savedAmount);
	
	}

}