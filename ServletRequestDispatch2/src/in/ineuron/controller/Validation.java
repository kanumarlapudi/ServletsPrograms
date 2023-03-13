package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valid")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Servlet1");
		
		String username = request.getParameter("username");
		String userPassword = request.getParameter("userPassword");
		
		System.out.println(username + " " + userPassword);
		
		
		if(username.contentEquals("harish") && userPassword.contentEquals("javalover")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			ServletContext servletContext = request.getServletContext();
			RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/error.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
