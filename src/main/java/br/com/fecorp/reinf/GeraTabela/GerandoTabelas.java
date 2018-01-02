package br.com.fecorp.reinf.GeraTabela;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerandoTabelas {

	public static void main(String[] args) {
		
		EntityManager em;
	    EntityManagerFactory fact = Persistence.createEntityManagerFactory("PersistenciaPU"); // Here it crashes
	    em = fact.createEntityManager();
	}    
}
