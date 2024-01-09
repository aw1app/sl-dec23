
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String sessIdStr = request.getParameter("browser-sess-id");
		
		if(sessIdStr==null) {
			int sessId = random.nextInt();
			response.sendRedirect("dashboard?browser-sess-id="+sessId); // Go to Dashboard servlet
		}
		

	}

}
