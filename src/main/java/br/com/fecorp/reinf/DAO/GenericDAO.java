package br.com.fecorp.reinf.DAO;

import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.transaction.TransactionManager;

abstract class GenericDAO<LocalContainerEntityManagerFactoryBean> {

    	protected EntityManager em;
    	
    	protected DriverManager dataSource;
    	
    	protected LocalContainerEntityManagerFactoryBean myEmf;
    	
    	protected TransactionManager transactionaManager;
}
