package br.com.fecorp.reinf.DAO;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import br.com.fecorp.reinf.model.TelaServicos;

@ManagedBean(name="servicoDAO")
public class TelaServicosDAO {

	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenciaPU");
	EntityManager em = factory.createEntityManager();
	
	
	public void salvar(TelaServicos servico){
		em.getTransaction().begin();
		em.merge(servico);
		em.getTransaction().commit();
		System.out.println("a persistencia deu certo");
		factory.close();
	}
	
	public void saveOrUpdate(TelaServicos servico) {
		try {
			em.getTransaction().begin();
			System.out.println("transaction started--------------");
			if (servico.getClass() == null)
				em.persist(servico);
			else
				em.merge(servico);
			System.out.println("estou no merge do insert--------------");
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public boolean inserirServico(TelaServicos servico) {
		try {
			em.merge(servico);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletarServico(TelaServicos servico) {
		try {
			em.remove(servico);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
