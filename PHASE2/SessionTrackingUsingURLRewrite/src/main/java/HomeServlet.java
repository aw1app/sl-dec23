
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

		if (sessIdStr == null) {
			int sessId = random.nextInt();

			// Let's add the sessId to the ServletContext so that we can implement
			// something like a ShoppingCart functionality
			request.getServletContext().setAttribute("sessIdStr", sessIdStr);
			
			Integer visits = (Integer) request.getServletContext().getAttribute(sessIdStr+"-no-of-visit");
			
			if (visits != null) {				
				visits++;
				request.getServletContext().setAttribute(sessIdStr+"-no-of-visit", visits);
				System.out.println("In visits != null. Incremented");
			}else {
				request.getServletContext().setAttribute(sessIdStr+"-no-of-visit", 1);
				System.out.println("In visits == null. set visits =1");
			}

			response.sendRedirect("dashboard?browser-sess-id=" + sessId); // Go to Dashboard servlet
		}

	}

}
