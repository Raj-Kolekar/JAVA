

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet_Cal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Servlet Calculator Result</title></head><body><center>");
		
		int a = Integer.parseInt(request.getParameter("n1"));
		int b = Integer.parseInt(request.getParameter("n2"));
		int result = 0;
		String operation = request.getParameter("opr");
		if(operation.equals("+"))
		{
			result = a+b;
		}
		if(operation.equals("-"))
		{
			result = a-b;
		}
		if(operation.equals("*"))
		{
			result = a*b;
		}
		if(operation.equals("/"))
		{
			result = a/b;
		}
		out.print("<h3>Result : "+result+"</h3>");
		out.println("To return to the main page <a href=index.html>Click here</a>.");
		out.println("</center></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
