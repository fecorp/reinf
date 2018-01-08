package br.com.fecorp.reinf.Bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	
	private String login;
	private String senha;
	
	public String autenticar(){
		return null;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
