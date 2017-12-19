package br.com.fecorp.reinf.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

public class TelaCadastroLoginDAO {

	public static TelaCadastroLoginDAO instance;
	public EntityManager entityManager;
	
	

	public static TelaCadastroLoginDAO getInstance(){

		if(instance == null){
			instance = new TelaCadastroLoginDAO();
		}

		return instance;
	}

	public TelaCadastroLoginDAO(){
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenciaPU");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public TelaCadastroLogin getById(final String nome) {
		return entityManager.find(TelaCadastroLogin.class, nome);
	}
	
	@SuppressWarnings("unchecked")
    public List<TelaCadastroLogin> findAll() {
              return entityManager.createQuery("FROM " + TelaCadastroLogin.class.getName()).getResultList();
    }
	
	 public void salvar(TelaCadastroLogin cadastroLogin) {
         try {
                  entityManager.getTransaction().begin();
                  entityManager.persist(cadastroLogin);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                 // System.out.println("Erro na persistencia");
                  entityManager.getTransaction().rollback();
         }
       }
          
          public void alterar(TelaCadastroLogin cadastroLogin) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.merge(cadastroLogin);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
          
	  }     
          
          public void deletar(TelaCadastroLogin cadastroLogin) {
              try {
                       entityManager.getTransaction().begin();
                       cadastroLogin = entityManager.find(TelaCadastroLogin.class, cadastroLogin.getNome());
                       entityManager.remove(cadastroLogin);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
              
          }     
          
          public void removeById(final String nome) {
              try {
                       TelaCadastroLogin cadastroLogin = getById(nome);
                       deletar(cadastroLogin);
              } catch (Exception ex) {
                       ex.printStackTrace();
              }
    }
          
          
}
          







