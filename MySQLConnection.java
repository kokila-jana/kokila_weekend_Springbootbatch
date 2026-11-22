
package weekend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/MySQLConnection")
public class MySQLConnection extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("pass");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("mail");

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pass = "kokilajana";

        String sql = "INSERT INTO register "
                + "(name, pass, phone, mail) "
                + "VALUES (?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con =
                    DriverManager.getConnection(url, user, pass);

                 PreparedStatement ps =
                    con.prepareStatement(sql)) {

                ps.setString(1, name);
                ps.setString(2, password);
                ps.setString(3, phone);
                ps.setString(4, mail);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println("<h1>User Registered Successfully!</h1>");
                } else {
                    out.println("<h1>Registration Failed!</h1>");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h1>Error: " + e.getMessage() + "</h1>");
        }
    }
}
