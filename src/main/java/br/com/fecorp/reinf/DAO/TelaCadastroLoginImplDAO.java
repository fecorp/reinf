package br.com.fecorp.reinf.DAO;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.fecorp.reinf.model.TelaCadastroLogin;

@ManagedBean(name="DAO")
@Repository
public class TelaCadastroLoginImplDAO implements TelaCadastroLoginDAO, Serializable{

    private static final Logger logger = LoggerFactory.getLogger(TelaCadastroLoginImplDAO.class);
	
	private static final long serialVersionUID = 1L;
	
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void salvar(TelaCadastroLogin cadastroLogin) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cadastroLogin);
		logger.info("Cadastro salvo com sucesso!!! =" + cadastroLogin);
		
	}
		
	

	@Override
	public void deletar(String nome) {
		Session session = this.sessionFactory.getCurrentSession();
		TelaCadastroLogin cadastroLogin = (TelaCadastroLogin) session.load(TelaCadastroLogin.class, new Integer(nome));
		if(null != cadastroLogin){
			session.delete(cadastroLogin);
		}
		logger.info("Cadastro excluido com sucesso!!! =" + cadastroLogin);
		
		
	}

	@Override
	public void atualizar(TelaCadastroLogin cadastrologin) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cadastrologin);
		logger.info("Cadastro atualizado com sucesso!!! =" + cadastrologin);
		
		
	}

	@Override
	public List<TelaCadastroLogin> listar() {
		Session session = this.sessionFactory.getCurrentSession();
		List<TelaCadastroLogin> listarCadastro = session.createQuery("from telacadastrologin").list();
		for(TelaCadastroLogin cadastroLogin : listarCadastro){
			logger.info("Person List::" + cadastroLogin);
		}
		return listarCadastro;
		
	}

	@Override
	public TelaCadastroLogin getTelaCadastroLoginById(String nome) {
		Session session = this.sessionFactory.getCurrentSession();		
		TelaCadastroLogin cadastroLogin = (TelaCadastroLogin) session.load(TelaCadastroLogin.class, new Integer(nome));
		logger.info("Sucesso ao buscar cadastro por ID!!! =" + cadastroLogin);
		return cadastroLogin;
	}
		
}

	

