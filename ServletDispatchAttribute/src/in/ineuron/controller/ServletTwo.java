package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet2")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control in ServletTwo");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1> Lets Print Attributes </h1>");
		
		Enumeration<String> attributeNames = request.getAttributeNames();
		while(attributeNames.hasMoreElements()==true) {
			String name = attributeNames.nextElement();
			printWriter.println(name);
		}
	}

}
