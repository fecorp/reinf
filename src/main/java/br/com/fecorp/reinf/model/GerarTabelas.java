package br.com.fecorp.reinf.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class GerarTabelas {

	public static void main(String[] args){
	
		
			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("PersistenciaPU");
			factory.close();
		}
		
}
