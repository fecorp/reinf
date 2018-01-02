package br.com.fecorp.reinf.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

public class TelaCadastroLoginDAO {

	private EntityManager getEntityManager() {
	    EntityManagerFactory factory = null;
	    EntityManager entityManager = null;
	    try {
	      //Obt�m o factory a partir da unidade de persist�ncia.
	      factory = Persistence.createEntityManagerFactory("PersistenciaPU");
	      //Cria um entity manager.
	      entityManager = factory.createEntityManager();
	      //Fecha o factory para liberar os recursos utilizado.
	    } finally {
	      factory.close();
	    }
	    return entityManager;
	  }

	  /**
	   * M�todo utilizado para salvar ou atualizar as informa��es de uma pessoa.
	   * @param pessoa
	   * @return
	   * @throws java.lang.Exception
	   */
	  public TelaCadastroLogin salvar(TelaCadastroLogin cadastroLogin) throws Exception {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transa��o com o banco de dados.
	      entityManager.getTransaction().begin();
	      System.out.println("Salvando o cadastro.");
	      // Verifica se a pessoa ainda n�o est� salva no banco de dados.
	      if(cadastroLogin.getDepartamento() == null) {
	        //Salva os dados da pessoa.
	        entityManager.persist(cadastroLogin);
	      } else {
	        //Atualiza os dados da pessoa.
	        cadastroLogin = entityManager.merge(cadastroLogin);
	      }
	      // Finaliza a transa��o.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	    return cadastroLogin;
	  }

	  /**
	   * M�todo que apaga a pessoa do banco de dados.
	   * @param id
	   */
	  public void excluir(String departamento) {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transa��o com o banco de dados.
	      entityManager.getTransaction().begin();
	      // Consulta a pessoa na base de dados atrav�s do seu ID.
	      TelaCadastroLogin cadastroLogin = entityManager.find(TelaCadastroLogin.class, departamento);
	      System.out.println("Excluindo os dados de: " + cadastroLogin.getNome());
	      // Remove a pessoa da base de dados.
	      entityManager.remove(cadastroLogin);
	      // Finaliza a transa��o.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	  }

	  /**
	   * Consulta o pessoa pelo ID.
	   * @param id
	   * @return o objeto Pessoa.
	   */
	  public TelaCadastroLogin consultarPorId(String departamento) {
	    EntityManager entityManager = getEntityManager();
	    TelaCadastroLogin cadastroLogin = null;
	    try {
	      //Consulta uma pessoa pelo seu ID.
	      cadastroLogin = entityManager.find(TelaCadastroLogin.class, departamento);
	    } finally {
	      entityManager.close();
	    }
	    return cadastroLogin;
	  }
          
          
}
          







