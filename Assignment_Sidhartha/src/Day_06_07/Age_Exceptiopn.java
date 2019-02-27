/**
 * 
 */
package Day_06_07;

/**
 * @author SIDHARTHA
 *
 */
public class Age_Exceptiopn 
{
	public static void main(String[] args)throws AgeExceptiopn{
		Person p= new Person();
		p.setFirstName("SIDHARTHA");
		p.setLastName("KAR");
		p.setGender("M");
		p.setAge(16);
		System.out.println("*******************The Persons Details******************** "
				+ " \n First Name of the Person Is  " + p.getFirstName() +
				"   \n Last namne of the Person Is "  + p.getLastName() +
				"   \n Person's Gender Is " + p.getGender());
		
		if(p.getAge()<18)
		{
			throw new AgeExceptiopn("Your Age Should Not  Below 18");
		}
		else {
			System.out.println(" Age is Perfect " +p.getAge());
		}
		
	}

}
