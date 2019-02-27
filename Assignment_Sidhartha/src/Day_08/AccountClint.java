package Day_08;

public class AccountClint {

	public static void main(String[] args) throws LowBalanceecception
	{
		AccountHolder a= new AccountHolder("SIDHARTHA");
		Account as= new SavingsAccount(a,5000);
		Account ac= new CurrentAccount(a, 4000);
		
		as.withdraw(10000);
		ac.withdraw(10000);
		System.out.println(ac.toString());
		System.out.println(as.toString());

	}

}
