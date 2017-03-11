import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDAO {

	public Connection connect() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration", "root", "chaitu@369");
			Statement st = con.createStatement();
			// here sonoo is the database name, root is the username and root is
			// the password
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users1");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			con.close();
			System.out.println("HelloWorld");

		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}

	public void speak() {

	}

}
