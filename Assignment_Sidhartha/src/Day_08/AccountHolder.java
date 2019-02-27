package Day_08;

public class AccountHolder 
{
	private String name;
	

	public AccountHolder(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AccountHolder Detail [name=" + name + "]";
	}

}

