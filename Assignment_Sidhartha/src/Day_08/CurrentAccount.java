package Day_08;

public class CurrentAccount extends Account
{
protected static double overDraftLimit =500;
	public CurrentAccount(AccountHolder accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(double amount) {
	boolean success = true;

		if( amount > accountBalance) {
			accountBalance = accountBalance + overDraftLimit;
			overDraftLimit = 0;
		}

		if(accountBalance >= amount){
			accountBalance = accountBalance - amount;
			System.out.println("Successful Withdrawal with overdraft limit, now "
				+" account balance is: " + accountBalance);
		} else {
			System.out.println("NOt Possible");
			System.out.println("withdrawal not possible " 
					+ " overdraft limit exceeded, now account balance:" + accountBalance);
			success = false;
			
		}

		return success;
	}
	

	}
