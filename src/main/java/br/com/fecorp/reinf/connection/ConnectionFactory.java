package br.com.fecorp.reinf.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenciaPU");;
	
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	
}
