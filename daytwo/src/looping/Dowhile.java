//prg to demonstrate dowhile
package looping;
import java.util.*;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
			System.out.println("Value of n is: "+n);
			n++;

		}while(n<14);

	}

}
