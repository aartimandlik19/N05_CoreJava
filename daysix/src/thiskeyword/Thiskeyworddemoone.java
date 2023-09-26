//It can be used to refer instance variable of current class
package thiskeyword;
public class Thiskeyworddemoone {

		//default variable
		int x,y;

		void setData(int x,int y)
		{
			this.x=x;
			this.y=y;
		}

		void display()
		{
			System.out.println(x+" "+y);
		}

		public static void main(String[] args) {
			Thiskeyworddemoone t=new Thiskeyworddemoone();
			t.setData(2, 3);
			t.display();
	}

}
