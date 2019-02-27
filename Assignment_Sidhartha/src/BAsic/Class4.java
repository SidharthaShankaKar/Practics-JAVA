package BAsic;

public class Class4 extends Class2
{
		public static double overDraftLimit = 500;

		public Class4(double balance, Class1 accHolder) {
			super(balance, accHolder);
		}

		@Override
		public boolean withdraw(int amount)
		{
			boolean success = true;

			if( amount > balance) {
				balance = balance + overDraftLimit;
				overDraftLimit = 0;
			}

			if(balance >= amount){
				balance = balance - amount;
				System.out.println("Withdrawal Successful with overdraft limit, now "
						+ getAccHolder().getName() +" account balance is: " + balance);
			} else {
				success = false;
				System.out.println("Sorry withdrawal not possible for account holder " + getAccHolder().getName() 
						+ " with account no:" + getAccNum() + " as overdraft limit exceeded, now account balance:" + balance);
			}

			return success;
		}

}
