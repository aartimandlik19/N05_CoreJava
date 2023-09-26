package thiskeyword;
//this can be passed as argument in the constructor call
public class Thiskeyworddemotwo {
	//default variable
			int x,y;


			public Thiskeyworddemotwo(int x, int y) {
			this.x = x;
			this.y = y;
			}
			void display() {
			System.out.println(x+" "+y);
			}
			public static void main(String[] args) {
				Thiskeyworddemotwo t=new Thiskeyworddemotwo(2,3);
				t.display();
}
}
