package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String depName = request.getParameter("depName");
		String depAmmount = request.getParameter("depAmmount");
		
		HttpSession session = request.getSession();
		session.setAttribute("depName", depName);
		session.setAttribute("depAmmount", depAmmount);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html> <head> <title> Deposit Form </title> </head>");
		out.println("<body bgcolor = 'cyan'>");
        out.println("<center>");
        out.println("<h1 style = color:'red'> Deatils About Transaction </h1>");
        out.println("<table border = '1' >");
        out.println("<tr><th>NAME</th><th>VALUE</th></tr>");
		
        Enumeration<String> attributeNames = session.getAttributeNames();
        while(attributeNames.hasMoreElements()) {
        	String attributeName = attributeNames.nextElement();
        	Object attributeValue = session.getAttribute(attributeName);
        	out.println("<tr>");
        	out.println("<td>" + attributeName + "</td>" );
        	out.println("<td>" + attributeValue + "</td>" );
        	out.println("</tr>");
        }
        
        
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
