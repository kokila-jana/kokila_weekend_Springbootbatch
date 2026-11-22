package weekend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;;

public class DBConnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection con=DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe","weekend","1234");
				PreparedStatement ps=con.prepareStatement("insert into info values(?,?)");
				ps.setString(1,"Mano");
				ps.setString(2, "13256");
				ps.executeQuery();
				System.out.println("DB connected...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
