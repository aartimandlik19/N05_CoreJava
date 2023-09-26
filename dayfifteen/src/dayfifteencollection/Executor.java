//program to demonstrate heterogeneous(different) list
package dayfifteencollection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Executor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.78f);
		listOne.add("hello");
		listOne.add(new String("hi") );
		
		System.out.println(listOne);
		//ClasscastException
		Collections.sort(listOne);
		
	}

}
