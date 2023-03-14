package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pcategory = request.getParameter("pcategory");
		String pmanufacturer = request.getParameter("pmanufacturer");
		
		Cookie[] cookies = request.getCookies();
		String pname = cookies[0].getValue();
		String pcost = cookies[1].getValue();
		String pbrand = cookies[2].getValue();
		String pquantity = cookies[3].getValue();

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body bgcolor='lightgreen'>");
		out.println("<h1 style='color:red; text-align:center;'>PRODUCT DETAILS...</h1>");
		out.println("<center>");
		out.println("<table border='1'>");
		out.println("<tr><th>NAME</th><th>VALUE</th></tr>");
		out.println("<tr><td> PNAME </td><td> " +  pname + "  </td></tr>");
		out.println("<tr><td> PCOST </td><td>" + pcost + "</td></tr>");
		out.println("<tr><td> PBRAND </td><td>" + pbrand + "</td></tr>");
		out.println("<tr><td> PQUANTITY </td><td>" + pquantity + "</td></tr>");
		out.println("<tr><td> PCATEGORY </td><td>" + pcategory + "</td></tr>");
		out.println("<tr><td> PMANUFACTURER </td><td>" + pmanufacturer + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
