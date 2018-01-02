package br.com.fecorp.reinf.Bean;


import java.io.Serializable;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import br.com.fecorp.reinf.DAO.TelaCadastroLoginDAO;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

@SessionScoped
@ManagedBean(name = "TelaCadastroBean")

public class TelaCadastroBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	 TelaCadastroLogin cadastroLogin = new TelaCadastroLogin();
	
	 TelaCadastroLoginDAO cadastrologinDAO = new TelaCadastroLoginDAO();

	public TelaCadastroLogin getCadastroLogin() {
		return cadastroLogin;
	}

	public void setCadastroLogin(TelaCadastroLogin cadastroLogin) {
		this.cadastroLogin = cadastroLogin;
	}

	public TelaCadastroLoginDAO getCadastrologinDAO() {
		return cadastrologinDAO;
	}

	public void setCadastrologinDAO(TelaCadastroLoginDAO cadastrologinDAO) {
		this.cadastrologinDAO = cadastrologinDAO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	
	


	
}
