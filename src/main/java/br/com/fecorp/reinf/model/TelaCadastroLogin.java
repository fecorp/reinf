package br.com.fecorp.reinf.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
public class TelaCadastroLogin {
	
	

	@Id
	@GeneratedValue
    @Column(name="id", nullable=false, unique=true)
	private long id;
	
	
	@Column(name="nome", nullable=false, unique=true)
	private String nome;

	@Column(name="departamento", nullable=false, unique=true)
	private String departamento;

	@Column(name="login", nullable=false, unique=true)
	private String login;

	@Column(name="senha", nullable=false, unique=false)
	private String senha;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
