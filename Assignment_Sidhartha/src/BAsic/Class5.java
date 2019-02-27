package BAsic;

public class Class5 
{
	public static void main(String[] args) {
		Class1 p1 = new Class1("Smith",28);
		Class1 p2 = new Class1("Kathy",25);
		Class2 savingAcc = new Class3(2000,p1);
		Class2 curAcc = new Class4(3000,p2);

		try {
			savingAcc.withdraw(10000);
			curAcc.withdraw(10000);
		} catch (Exception le) {
			System.out.println("Error occured due to low balance");
			le.printStackTrace();
		}
		System.out.println(savingAcc.toString());
		System.out.println(curAcc.toString());

	}

}
