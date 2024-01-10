
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		
		Cookie[] cookies = request.getCookies();
		
		boolean sessIdCookieExist=false; // variable to track if browser-session related cookie is already present in the request
		
		if(cookies!=null)
		for(Cookie cookie : cookies) {
			String nameOfCookie = cookie.getName();
			
			if(nameOfCookie.equals("browser-sess-id")) {
				sessIdCookieExist=true;
				break;
			}
			
		}
		
		
		

		if (sessIdCookieExist == false) {
			int sessId = random.nextInt();
			Cookie sessIdCookie = new Cookie("browser-sess-id",""+sessId );
			response.addCookie(sessIdCookie);
		}else {
			out.println("Welcome User.");
			out.println("<br> We are tracking you.");
		}

			

			response.sendRedirect("dashboard"); // Go to Dashboard servlet
		}

	}


