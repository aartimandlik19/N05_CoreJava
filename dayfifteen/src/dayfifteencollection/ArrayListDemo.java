//program to demonstrate homogeneous ArrayList
package dayfifteencollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(40);
		intList.add(30);
		intList.add(60);
		
		System.out.println(intList);
		intList.add(2,50);//for adding the element in 2nd position
		System.out.println(intList);
		System.out.println("is 10 present?"+intList.contains(10));
		System.out.println("is 10 present?"+intList.contains(100));
		System.out.println("remove element at 5:"+intList.remove(5));
		System.out.println(intList);
		
		System.out.println("remove element 30:"+intList.remove(intList.indexOf(30)));
		
		System.out.println(intList.indexOf(46)>=0?"46 is present":"46 is not prsent");
		System.out.println(intList);
		
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+":"+no*no);
		}
		Collections.sort(intList);
		System.out.println("..........After Sorting.......");
		System.out.println(intList);
		Collections.reverse(intList);
		System.out.println("..........After Reversing.......");
		System.out.println(intList);
		intList.clear();
	}

}
