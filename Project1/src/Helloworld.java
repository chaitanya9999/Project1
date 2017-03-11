import java.sql.*;

public class Helloworld {

	public static void main(String[] args) {
		
		//Creating instance 
		BaseDAO base= new BaseDAO();
		//Calling "connect " method in basedao
		base.connect();
	     System.out.println("HelloWorld");
	}

}