package BAsic;

public abstract class  Class2 
{
		private long accNum;
		protected double balance;
		private Class1 accHolder;


		static int id;
		static {
			id= (int) (1000+ Math.random()*1234.1234);
		}

		public Class2(double balance, Class1 accHolder) {
			this.balance = balance;
			this.accHolder = accHolder;
			accNum=id++;
		}

		//Make a deposit of a specified amount
		public void deposit(int amount)
		{
			balance += amount;
			System.out.println("Deposit amount: " + amount + ", now " 
					+ accHolder.getName() + " account with account no:" + accNum + ", balance is: " + balance);
		}

		//Make a withdrawal of a specified amount
		public abstract boolean withdraw(int amount) throws Exception;
		

		//Get the balance
		public double getBalance() {
			return balance;
		}

		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}

		public Class1 getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Class1 accHolder) {
			this.accHolder = accHolder;
		}
		@Override
		public String toString() {
			return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}

	}
