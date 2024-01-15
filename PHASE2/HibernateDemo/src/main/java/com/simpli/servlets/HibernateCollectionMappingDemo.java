package com.simpli.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simpli.Color;
import com.simpli.EProduct;
import com.simpli.HibernateUtil;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hibernate-collection-mapping-demo")
public class HibernateCollectionMappingDemo extends HttpServlet {

	SessionFactory sessionFactory = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		// Get the SessionFactory object and the Session object
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		Session session = sessionFactory.openSession();

		// Fetch data from eproduct table

		List<EProduct> products = session.createQuery("from EProduct").list();

		out.println("<table border=1>");
		out.printf("<th>ID <th> NAME <th>PRICE<th>DATE_ADDED <th colspan=2>COLORS</th>");
		for (EProduct p : products) {

			out.println("<tr>");

			out.printf("<td> %s", p.getID());
			out.printf("<td>  %s", p.getName());
			out.printf("<td> %s", p.getPrice());
			out.printf("<td>  %s", p.getDateAdded());
			
			List<Color> colors = p.getColors();
			for(Color color : colors)	out.printf("<td>  %s", color.getName());		

		}

		out.println("</table>");
		session.close();

		out.println("</body></html>");
		out.close();

	}

}
