package thiskeyword;

public class Thiskeyworddemothree {
	void print(Thiskeyworddemothree t)
	{
		System.out.println("Hey there, I am using 'this'"
				+ "keyword");
	}
	void display()
	{
		/*when you call any parameterized method inside 
		 * non-parameterized method then, we get an error,
		 * to overcome that we have to use this keyword as an argument
		 * in method call*/
		print(this);
	}

	public static void main(String[] args) {
		Thiskeyworddemothree t=new Thiskeyworddemothree();
		t.display();

}
}