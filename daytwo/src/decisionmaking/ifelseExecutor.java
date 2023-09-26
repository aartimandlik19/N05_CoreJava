package decisionmaking;
import java.util.*;

public class ifelseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Elligible to donate the blood");
		}
		else
		{
			System.out.println("Not eligible");
		}

	}

}
