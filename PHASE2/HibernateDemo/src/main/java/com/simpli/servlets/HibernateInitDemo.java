package com.simpli.servlets;

import java.io.IOException;
import org.hibernate.SessionFactory;
import com.simpli.HibernateUtil;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HibernateInitDemo extends HttpServlet {
	
	SessionFactory sessionFactory = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		// Get the SessionFactory object and the Session object
		sessionFactory = HibernateUtil.getSessionFactory();		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
