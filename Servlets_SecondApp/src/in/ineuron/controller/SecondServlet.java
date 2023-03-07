package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class SecondServlet implements Servlet {

	static
	{
		System.out.println("SecondServlet .class file is loading...");
	}
	
    public SecondServlet() {
    	System.out.println("SecondServlet Object is instantiated...");
    }

  //For Servlet Initialization container calls this method
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialziation...");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Servlet De-Instantiation...");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		System.out.println("Servlet Request Processing ...");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red;'><marquee>Welcome 2 Advanced Java...</marquee></h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
