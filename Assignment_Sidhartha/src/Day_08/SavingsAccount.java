package Day_08;

public class SavingsAccount extends Account
{
protected static final double MinmumBal=500;

	public SavingsAccount(AccountHolder accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	

	@Override
	public boolean withdraw(double amount) 
	{
		double Balance=accountBalance-amount;
		if(Balance>=MinmumBal)
		{
		System.out.println("WithDraw Is Possible");
		System.out.println("After WithDrwal New Balance Is " + accountBalance);
		}
		else {
			System.out.println("Withdrawl Is not Possible" + accountBalance);
		}
		return true;
	}
}
