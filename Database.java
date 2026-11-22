package weekend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) throws  SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","weekend","1234");
		PreparedStatement ps=con.prepareStatement("insert into stud values(?,?)");
		ps.setString(1, "Jana");
		ps.setString(2, "janamano");
		ps.executeQuery();
		System.out.println("Data inserted...");

	}

}
