package br.com.fecorp.reinf.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "cadastrologin")

@Entity
public class TelaCadastroLogin {
	
	


	@Id
	@GeneratedValue
	@Column(name="nome")
	private String nome;

	@Column(name="departamento")
	private String departamento;

	@Column(name="login")
	private String login;

	@Column(name="senha")
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
