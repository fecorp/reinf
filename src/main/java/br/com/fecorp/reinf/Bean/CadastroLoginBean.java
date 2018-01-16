package br.com.fecorp.reinf.Bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fecorp.reinf.DAO.TelaCadastroLoginDAO;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

@ManagedBean
@SessionScoped
public class CadastroLoginBean implements Serializable{

	private TelaCadastroLogin cadastroLogin = new TelaCadastroLogin();
	private TelaCadastroLoginDAO cadastroLoginDAO;
	
	
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
