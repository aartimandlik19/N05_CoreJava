package multidimensionalarray;
import java.util.*;

public class Twodimensionalarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][2];
		//for initilaizing an array values
		//outside array
		for(int i=0;i<3;i++)
		{
			//inside array
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//for printing a values
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

	}

}
}
