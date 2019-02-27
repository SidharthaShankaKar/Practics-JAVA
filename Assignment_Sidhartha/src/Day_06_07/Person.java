/**
 * 
 */
package Day_06_07;

/**
 * @author SIDHARTHA
 *
 */
public class Person 
{
	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	
	public Person() {

	}
	public void print()
	{
		System.out.println("******************The Persons Details******************** "
							+ " \n First Name of the Person Is  " + FirstName  +
							"   \n Last namne of the Person Is "  + LastName +
							"   \n Person's Age is " + Age +
							"   \n Person's Gender Is " + Gender);
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
}
