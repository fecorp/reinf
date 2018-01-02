package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;

public class HibernateUtil {

	private static EntityManagerFactory emf;

	private HibernateUtil() {
	}

	public static EntityManagerFactory geteEntityManagerFactory() {
		if (emf == null) {
			try {
				emf = Persistence.createEntityManagerFactory("PersistenciaPU");
			} catch (Exception ex) {
				System.err.println("Initial SessionFactory creation failed."
						+ ex);
			}
		}
		return emf;
	}

	
	
}
