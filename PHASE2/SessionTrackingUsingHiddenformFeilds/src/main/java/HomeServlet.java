
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sessId = random.nextInt();

		PrintWriter out = response.getWriter();

		out.println("<form action='dashboard' method='POST'>");
		out.println("<input type='hidden' name='browser-sess-id' value='" + sessId + "'>");
		out.println("<input type='submit' value='submit' >");
		out.println("</form>");
		out.println("<script>document.forms[0].submit();</script>");

		out.close();

	}

}
