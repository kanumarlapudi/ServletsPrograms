package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1> Servlet 1 response </h1>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");
		requestDispatcher.include(request, response);
		
		System.out.println("Dispatch is Success");
		
		writer.println("<h1> Servlet 1 response again </h1>");
	}

}
