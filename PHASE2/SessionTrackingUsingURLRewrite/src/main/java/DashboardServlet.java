
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

		PrintWriter out = response.getWriter();
		
		String sessIdStr = request.getParameter("browser-sess-id");
		
		if(sessIdStr!=null) {			
			out.println("Welcome User. I think you first went to Home and got redirected to me. ");
			out.println("<br> We are tracking you.");
		}else {
			out.println("Welcome User. Looks like you directly came to me.");
		}

	}

}
