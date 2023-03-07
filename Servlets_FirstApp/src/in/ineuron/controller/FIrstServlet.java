package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class FIrstServlet implements Servlet {
	
	static {
		System.out.println("FirstServlet.class file is loading...");
	}

	public FIrstServlet()
	{
		System.out.println("FirstServlet Object is instantiated...");
	}
	
	//Servlet DeInstantion logic
	@Override
	public void destroy() {
		System.out.println("Servlet De-Instantiation...");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	//For Servlet Initialization container calls this method
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet Request Processing ...");	
	}

	//Request Processing logic
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
