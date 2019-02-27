package BAsic;

public class Class3 extends Class2 
 {
		public static final double MIN_BALANCE = 500;

		public Class3(double balance, Class1 accHolder) {
			super(balance, accHolder);
		}

		@Override
		public boolean withdraw(int amount) {
			boolean success = true;
			double bal = balance - amount;
			if( bal > MIN_BALANCE) {
				balance -= amount;

	System.out.println("Withdrawal Successful, now " + getAccHolder().getName() 
	+ " account with account no:" + getAccNum() + ", balance is: " + balance);
			} else {
				success = false;
				System.out.println("Sorry withdrawal not possible for account holder "
						+ getAccHolder().getName() + " with account no:" + getAccNum() + " as account balance is low :" + balance);
			}
			return success;
		}
	}

