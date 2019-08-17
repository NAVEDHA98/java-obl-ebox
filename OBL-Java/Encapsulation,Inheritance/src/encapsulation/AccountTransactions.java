package encapsulation;

import java.util.Scanner;

public class AccountTransactions
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account Number");
		String  accountNumber = sc.next();
		
		System.out.println("Enter the Account Balance");
		int balance = sc.nextInt();
		
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int transaction = sc.nextInt();
		
		Account account = new Account(accountNumber, balance);
		
		if(transaction == 1)
		{
			System.out.println("Enter the amount to deposit");
			int depositAmount = sc.nextInt();
			account.deposit(depositAmount);
		}
		else if(transaction == 2)
		{
			System.out.println("Enter the amount to withdraw");
			int withdrawAmount = sc.nextInt();
			account.withdraw(withdrawAmount);
		}
	}
}
