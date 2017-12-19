package br.com.fecorp.reinf.Bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import br.com.fecorp.reinf.DAO.TelaCadastroLoginDAO;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

@ManagedBean(name = "TelaCadastroBean")
@SessionScoped
public class TelaCadastroBean {

	private TelaCadastroLogin cadastroLogin;
	private TelaCadastroLoginDAO cadastroLoginDAO;
	
	public TelaCadastroBean(){}
	
	  public TelaCadastroBean(TelaCadastroLogin cadastroLogin) {
	        this.cadastroLogin = cadastroLogin;
	    }

	public TelaCadastroLogin getCadastroLogin() {
		return cadastroLogin;
	}

	public void setCadastroLogin(TelaCadastroLogin cadastroLogin) {
		this.cadastroLogin = cadastroLogin;
	}

	public TelaCadastroLoginDAO getCadastroLoginDAO() {
		return cadastroLoginDAO;
	}

	public void setCadastroLoginDAO(TelaCadastroLoginDAO cadastroLoginDAO) {
		this.cadastroLoginDAO = cadastroLoginDAO;
	}
	
	

	  

}
