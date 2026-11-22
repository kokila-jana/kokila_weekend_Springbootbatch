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
 * Servlet implementation class Firstser
 */
@WebServlet("/Firstser")
@MultipartConfig
public class Firstser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firstser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		pw.print("<h1>Hello...</h1>");
		
//		response.setContentType("text/html");
//		String s=request.getParameter("name");
//		PrintWriter out=response.getWriter();
//		out.print("<h1> Welcome...."+s+"</h1>");
		
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String a[]=request.getParameterValues("sub");
////		for(int i=0;i<a.length;i++)
////		{
////			out.print(a[i]);
////		}
//		
//		for(String i:a)
//		{
//			out.print(i+"<br><br>");
//		}
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		String s=request.getHeader("User-Agent");
//		pw.print(s);
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		HttpSession s=request.getSession();
//		s.setAttribute("Name", "Kokila");
//		String ss=(String) s.getAttribute("Name");
////		System.out.println(ss);
//		pw.print(ss);
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		String s=request.getParameter("n1");
//		String s1=request.getParameter("n2");
//		try
//		{
//		int a=Integer.parseInt(s);
//		int b=Integer.parseInt(s1);
////		pw.print(a+b);
//		int c=a/b;
//		pw.print(c+"<br>");
//		}
//		catch(Exception e)
//		{
//			pw.print(e+"<br>");
//		}
//		finally
//		{
//			pw.print("HEllo....."+"<br>");
//		}
		
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		HttpSession s=request.getSession(true);
//		Date create=new Date(s.getCreationTime());
//		Date Last=new Date(s.getLastAccessedTime());
//		
//		String user="kokila";
//		String msg;
//		if(s.isNew())
//		{
//			msg="Welcome....";
//		}
//		else
//		{
//			msg="Welcome back...";
//		}
//		pw.print(msg+" "+user+"<br>");
//		pw.print("Session created...at.."+create+"<br>");
//		pw.print("Last accessed Time"+Last+"<br>");
//		response.sendRedirect("f1.html");
		

//		response.setIntHeader("Refresh",10);
//		response.setContentType("text/html");
//		PrintWriter pw=response.getWriter();
//		Format df=new SimpleDateFormat("DD:MM:YYYY.HH:mm:ss");
//		Date d=new Date();
//		String date=df.format(d);
//		pw.print(date);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Part p=request.getPart("file");
		String filename=p.getSubmittedFileName();
		p.write("D:\\kokila ppts"+filename);
		response.getWriter().print("File uploaded...");
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
