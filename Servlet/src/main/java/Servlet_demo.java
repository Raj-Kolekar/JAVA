
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Login</title></head><body><center>");
		String username = "Aditya";
		String password = "Aditya@11";
		String formUser = request.getParameter("txtID");
		String formPassword = request.getParameter("txtPass");
		if(username.equals(formUser) && password.equals(formPassword))
		{
			out.println("<h3> Welcome "+formUser+" !</h3>");
		}
		else
		{
			out.println("<h3> Login failed !!</h3>");
		}
		
		out.println("</center></body></html>");
	}
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
