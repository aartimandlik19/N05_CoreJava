package singledimensionalarray;
//driver class
//program to demonstrate on array of objects

public class Arraysofobjectdemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0]=new Employee(101, "Aniket Gaikwad", 45000.8);
		arr[1]=new Employee(102, "Paras kitey", 34000.7);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "
					+arr[i].getSalary());

	}

}
}