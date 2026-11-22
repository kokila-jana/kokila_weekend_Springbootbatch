<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!

	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
%>
<%

int x=add(12,36);
out.print(x);
/*int a=10,b=20,c=45,d=78;
out.print(a+b+"<br>");
out.print((a+=b)+"<br>");
out.print((b<c)+"<br>");
out.print((c<d && a>b)+"<br>");*/

/*int a=18;
if(a>=18)
{
	out.print("Eligible for Vote....");
}
else
{
	out.print("Not Eligible for Vote....");	
}*/

/*for(int i=1;i<=10;i++)
{
	out.print(i+"<br>");
}
*/



%>

</body>
</html>