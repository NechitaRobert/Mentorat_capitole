
import java.sql.Connection;
import java.sql.DriverManager;


public class Main {

	// conexiune
	public static Connection conexiune() throws Exception {
		try {
			Connection conn = DriverManager.getConnection("jbdc:mysql://127.0.0.1:3306/magazin", "root", "1234");
			System.out.println("conexiunea a reusit");
			return conn;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("conexiunea a esuat");
		}
		return null;
	} 
	

	public static void main(String args[]) throws Exception  {
		conexiune();
	}

}