package polymorphism;
import java.util.*;
//program to demonstrate on Method overriding
class Laptop{

	//String generation1,generation2;
	void specification(String generation1,String generation2)
	{
		System.out.println("Laptop: "+generation1);
	}

}
class Asus extends Laptop{
	//String generation1,generation2;
	void specification(String generation1,String generation2)
	{
		super.specification(generation1,generation2);
		System.out.println("Asus: "+generation2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Asus a =new Asus();
		@SuppressWarnings("unused")
		String generation1=s.nextLine();
		String generation2=s.nextLine();
		a.specification(generation1,generation2);


	}

}
