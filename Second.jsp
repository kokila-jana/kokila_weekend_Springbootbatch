<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="Second.jsp" method="post" >
      Name <input type="text" name="name"><br><br>
      <input type="submit">
    </form>
    <%
    String s=request.getParameter("name");
    out.print("Welcome...."+s);
    %>

</body>
</html>