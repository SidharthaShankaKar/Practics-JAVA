package Day_08;

public class AccountClint {

	public static void main(String[] args)
	{
		AccountHolder a= new AccountHolder("SIDHARTHA");
		Account as= new SavingsAccount(a,5000);
		Account ac= new CurrentAccount(a, 4000);
		
		try {
			as.withdraw(2000);
			ac.withdraw(1000);
		} catch (Exception e) {
			System.out.println("Due TO LOw Balance Transaction Not Possible");
		}
		System.out.println(ac.toString());
		System.out.println(as.toString());

	}

}
