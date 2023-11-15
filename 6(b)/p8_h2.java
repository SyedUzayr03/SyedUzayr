iimport java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p8_h2 extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse
response)throws ServletException, IOException{

try
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
//Getting the value from the hidden field
String n=request.getParameter("brand");
out.print("You will be updated with facts on "+n+".thank you for visiting.");
out.close();
}
catch(Exception e){System.out.println(e);}
}
}
