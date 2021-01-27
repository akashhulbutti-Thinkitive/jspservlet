
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/HelloServlet")*/
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static int counter=0;
	public PrintWriter out;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet inititiated...");
	}

	public HelloServlet() {
		super();
		System.out.println("Visitor.. "+counter);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Visitor : "+counter++);
		this.out=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.out=response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int num = Integer.parseInt(request.getParameter("numbers"));
		System.out.println("Username : "+username+"\n Password : "+password);
		out.println("Username : "+username+"\n Password : "+password);
		out.println("Factorial of Number is : "+CalcFactorial.calcFactorialNumber(num));
		doGet(request, response);
	}

}
