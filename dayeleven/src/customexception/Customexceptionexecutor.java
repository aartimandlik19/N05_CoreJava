package customexception;
import java.util.Scanner;
//program to demonstrate on User-defined exception
//driver class
public class Customexceptionexecutor {
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email id and password");
		String email=s.nextLine();
		String password=s.nextLine();
		try {
			if(email.equals("skumbhalkar@tnsif.org") && 
				password.equals("Pass@123"))
			{
				System.out.println("Credential matched");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
}
}
