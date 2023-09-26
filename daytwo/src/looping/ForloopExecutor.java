package looping;
import java.util.*;

public class ForloopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}
