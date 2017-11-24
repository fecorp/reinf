package br.com.fecorp.reinf.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import br.com.fecorp.reinf.model.TelaServicos;

public class TelaServicosDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenciaPU");
	private EntityManager em = factory.createEntityManager();

	public boolean inserirServico(TelaServicos servico) {
		try {
			em.persist(servico);
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
