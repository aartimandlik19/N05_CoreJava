package finalkeyword;

public class Finalkeywordexecutor {
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable ();
		/*we can't change the value of final variable*/
		//f.SALARY=689709.09f;
		f.print();

		Circle c=new Circle();
		c.printShapeType();
		c.printShapeType(c.area);


}
}
