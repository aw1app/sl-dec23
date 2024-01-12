package com.simpli;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	static {

		try {

			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();

			Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();

			sessionFactory = metaData.getSessionFactoryBuilder().build();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
