package decisionmaking;
import java.util.*;

public class Switchexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("Perfect");
				break;
			case 2:
				System.out.println("Oo Antava");
				break;
			case 3:
				System.out.println("Taki taki");
				break;
			default:
				System.out.println("Invalid input");
		}
	}

	}


