package encapsulation;

public class Account 
{
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber, int balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public int getBalance() 
	{
		return balance;
	}
	
	public void deposit(int transactionAmount)
	{
		balance = balance + transactionAmount;
		System.out.println("Your balance after the transaction is:"+balance);
	}
	
	public void withdraw(int transactionAmount)
	{
		int balance1 = balance;
		balance = balance - transactionAmount;
		if(balance < 0)
		{
			System.out.println("Insufficient Balance");
			balance = balance1;
		}
		System.out.println("Your balance after the transaction is:"+balance);
	}
}
