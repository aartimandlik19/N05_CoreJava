package thiskeyword;

public class Thiskeyworddemofour {
	int x;
	//default constructor
	Thiskeyworddemofour()
	{
		//invoking current parametrized constructor
		this(34);
		System.out.println("Default Constructor");
	}
	Thiskeyworddemofour(int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor: "+x);
	}


	public static void main(String[] args) {
		Thiskeyworddemofour f=new Thiskeyworddemofour();

}
}