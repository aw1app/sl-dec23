
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String sessIdStr = request.getParameter("browser-sess-id");
		
		if(sessIdStr!=null) {			
			out.println("Welcome User. I think you first went to Home and got redirected to me. ");
			out.println("<br> We are tracking you.");
			
			Integer visits = (Integer) request.getServletContext().getAttribute(sessIdStr+"-no-of-visit");
			if (visits != null) {				
				visits++;
				request.getServletContext().setAttribute(sessIdStr+"-no-of-visit", visits);
				System.out.println("In visits != null. Incremented");
			}else {
				request.getServletContext().setAttribute(sessIdStr+"-no-of-visit", 1);
				System.out.println("In visits == null. set visits =1");
			}
			
			out.println("<br> <br> You have visited us :" + visits + " times");
			out.println("<br> <br> <a href=\"home\">Go to Home Page</a>");
			
		}else {
			out.println("Welcome User. Looks like you directly came to me.");
			out.println("<br> <br> <a href=\"home\">Go to Home Page</a>");
		}

	}

}
