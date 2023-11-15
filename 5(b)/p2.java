import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p2 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Welcome back";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         


      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Name</b>: "
                  + request.getParameter("name") + "\n" +
                  "  <li><b>Place</b>: "
                  + request.getParameter("place") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );

      out.println(docType +
         "<html>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<ul>\n" +
                  "  <li><b>Sunset Point: </b>: "
                  + request.getParameter("sunset") + "\n" +
                  "  <li><b>Beach: </b>: "
                  + request.getParameter("beach") + "\n" +
                  "  <li><b>Vivekananda Rock: </b>: "
                  + request.getParameter("vivek") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
   }
