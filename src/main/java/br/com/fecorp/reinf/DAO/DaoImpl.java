package br.com.fecorp.reinf.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class DaoImpl <T, I extends Serializable> implements DaoGenerico<T, I> {

	 
	private Conexao conexao;
	  
	 @Override
	 public T save(T entity) {
	   
	  T saved = null;
	   
	  getEntityManager().getTransaction().begin();
	  saved = getEntityManager().merge(entity);
	  getEntityManager().getTransaction().commit();
	   
	  return saved;
	 }
	 
	 @Override
	 public void remove(T entity) {
	  getEntityManager().getTransaction().begin();
	  getEntityManager().remove(entity);
	  getEntityManager().getTransaction().commit();
	   
	 }
	 
	 @Override
	 public T getById(Class<T> classe, I pk) {
	   
	  try {
	   return getEntityManager().find(classe, pk);
	  } catch (NoResultException e) {
	   return null;
	  }
	   
	 }
	 
	 @SuppressWarnings("unchecked")
	 @Override
	 public List<T> getAll(Class<T> classe) {
	   
	  return getEntityManager().createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
	 }
	 
	 @Override
	 public EntityManager getEntityManager() {
	   
	  if (conexao == null) {
	   conexao = new Conexao();
	  }
	  return conexao.getEntityManager();
	 }
	 	
	
}
