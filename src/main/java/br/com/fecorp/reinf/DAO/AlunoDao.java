package br.com.fecorp.reinf.DAO;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.fecorp.reinf.model.Aluno;

public class AlunoDao {

	public Aluno saveOrUpdate(Aluno aluno) {
		EntityManager em = util.HibernateUtil.geteEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			System.out.println("transaction started--------------");
			if (aluno.getId() == null)
				em.persist(aluno);
			else
				em.merge(aluno);
			System.out.println("estou no merge do insert--------------");
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		//return aluno;
		return aluno;
	}
	
	public void delete(Aluno aluno) {
		EntityManager em = util.HibernateUtil.geteEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Aluno al = em.find(Aluno.class, aluno.getId());
			em.remove(al);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public List<Aluno> list() {
		List<Aluno> result = null;
		try {
			EntityManager em = util.HibernateUtil.geteEntityManagerFactory().createEntityManager();
			Query query = em.createQuery("FROM Aluno");
			result = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
