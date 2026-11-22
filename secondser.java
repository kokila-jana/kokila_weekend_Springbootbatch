package weekend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class secondser
 */
@WebServlet("/secondser")
@MultipartConfig
public class secondser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

//		response.setContentType("html/text");
//		PrintWriter out=response.getWriter();
//		out.print("Hello Java");
//		out.print("<h1> Hello java</h1>");
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		String s=request.getParameter("simple");
//		pw.print("Hello "+s);
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		String a[]=request.getParameterValues("check");
////		for(int i=0;i<a.length;i++)
////		{
////			pw.print(a[i]+"<br>");
////		}
//		for(String s:a)
//		{
//			pw.print(s+"<br>");
//		}
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		String s=request.getHeader("User-Agent");
//		pw.print(s);
		

//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		HttpSession ses=request.getSession();
//		ses.setAttribute("username", "Kokila");
//		String s=(String) ses.getAttribute("username");
//		pw.print(s);
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		try
//		{
//		int a=10,b=0;
//		int c=a/b;
//		pw.print(c);
//		}
//		catch(Exception e)
//		{
//			pw.print(e);
//		}
//		finally
//		{
//			pw.print("helllo");
//		}
		
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		HttpSession session=request.getSession(true);
//		Date user=new Date(session.getCreationTime());
//		Date last=new Date(session.getLastAccessedTime());
//		String name="Jana";
//		String greeting;
//		if(session.isNew())
//		{
//			greeting="welcome..."+name;
//		}
//		else
//		{
//			greeting="welcome back "+name;
//		}
//		pw.print(greeting+"<br>");
//		pw.print("<h1> Creation Time: "+user+"</h1><br>");
//		pw.print("<h1>Last Accessed Time: "+last+"</h1><br>");
		
//		response.sendRedirect("Second.html");
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		response.setIntHeader("Refresh", 10);
//		Format f=new SimpleDateFormat("dd:MM:YYYY HH:mm:ss");
//		Date d=new Date();
//		String s=f.format(d);
//		pw.print(s);
		
		Part file = request.getPart("file");
        String fileName = file.getSubmittedFileName();

        file.write("D:/uploads/" + fileName);//C:/your folder name

        response.getWriter().println("File Uploaded Successfully!");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
