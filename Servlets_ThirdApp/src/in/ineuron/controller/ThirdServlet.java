package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/test",loadOnStartup = 10)
public class ThirdServlet implements Servlet {

	static
	{
		System.out.println("ThirdServlet .class file is loading...");
	}

	public ThirdServlet()
	{
		System.out.println("ThirdServlet Object is instantiated...");
	}

	//For Servlet Initialization container calls this method
	public  void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet initialziation...");
	}

  	public ServletConfig getServletConfig()
	{
		return null;
	}

	//Request Processing logic
  	public  void service(ServletRequest request,ServletResponse response) 
		throws ServletException, IOException
	{
		response.setContentType("text/html");

		System.out.println("Servlet Request Processing ...");

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red;'><marquee>Working with Annotations for Servlet</marquee></h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();


	}

  	public  String getServletInfo()
	{
		return null;
	}

	//Servlet DeInstantion logic
  	public  void destroy()
	{
		System.out.println("Servlet De-Instantiation...");
	}

}
