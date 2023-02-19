
package com.pakage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author tinke
 */
public class RegsiterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException{
               response.setContentType("text/html");
               PrintWriter out  = response.getWriter();
               out.println("<h2>Welcome To Servlet </h2>");
               String name = request.getParameter("user_name");
               String password = request.getParameter("user_password");
               String email = request.getParameter("user_email");
               String gender = request.getParameter("user_gender");
               String course = request.getParameter("user_course");
               String con = request.getParameter("condition");
               
               if(con.equals("checked")){
               out.println("<h2>Name :" + name + " </h2>");
               out.println("<h2>Password :" + password + " </h2>");
               out.println("<h2>Email :" + email + " </h2>");
               out.println("<h2>Gender :" + gender + " </h2>");
               out.println("<h2>Course :" + course+ " </h2>");
               }
               else{
               out.print("<h2>You hav Not Accpted Term and contion</h2>");
               }
               
               
               
    }
}
