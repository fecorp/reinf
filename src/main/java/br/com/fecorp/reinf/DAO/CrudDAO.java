package br.com.fecorp.reinf.DAO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

public interface CrudDAO<T, I extends Serializable> {

	public T salvar(T entity);

	public void deletar(T entity);
	
	public List<T> buscar();

	public T getById(Class<T> classe, I pk);

	public List<T> getAll(Class<T> classe);

	public EntityManager getEntityManager();
}
