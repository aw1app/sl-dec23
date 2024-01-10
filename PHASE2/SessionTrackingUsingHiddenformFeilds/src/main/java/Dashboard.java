
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sessId = request.getParameter("browser-sess-id");

		if (sessId != null) {
			out.println("Welcome User.");
			out.println("<br> We are tracking you.");
			out.println("<br> <br> <a href=\"home\">Go to Home Page</a>");
		} else {
			// we would be here if no "browser-sess-id" was set for this user's browser session
			out.println("Welcome User. Looks like you directly came to me.");
		}

		out.close();

	}

}
