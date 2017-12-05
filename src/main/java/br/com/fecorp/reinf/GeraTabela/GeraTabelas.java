package br.com.fecorp.reinf.GeraTabela;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {
	
  public static void main(String[] args) {
		    EntityManagerFactory factory = Persistence.
		          createEntityManagerFactory("PersistenciaPU");

	    factory.close();
		  }
		}

