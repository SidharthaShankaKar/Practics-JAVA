/**
 * 
 */
package Day_08;

/**
 * @author SIDHARTHA
 *
 */
abstract public class Account
{
private long accountNo;
private AccountHolder accountHolderName;
protected double accountBalance;
static int accountId;

static {
	accountId=(int) (1000+Math.random()*9876);
}

public Account(AccountHolder accountHolderName, double accountBalance) {
	super();
	this.accountHolderName = accountHolderName;
	this.accountBalance = accountBalance;
	accountNo=accountId++;
}
	public void deposite(int Amount)
	{
		accountBalance=accountBalance+Amount;
System.out.println("New Balance After Deposite Will be " + accountBalance);
	}
	public abstract boolean withdraw(double amount);
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public AccountHolder getAccountHolderName() {
		return accountHolderName;
	}
	public AccountHolder setAccountHolderName(AccountHolder accountHolderName) {
		return this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	@Override
	public String toString() {
return "Account [accountNo=" + accountNo + ","
		+ "accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
}