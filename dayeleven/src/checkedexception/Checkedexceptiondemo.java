//prg to demonstrate checkedexception
package checkedexception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Checkedexceptiondemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\PC\\Downloads\\TNSIF.txt");
			System.out.println("File has found");
		} catch (FileNotFoundException e) {
			System.out.println("File is not exist: "+e);

	}

}
}
