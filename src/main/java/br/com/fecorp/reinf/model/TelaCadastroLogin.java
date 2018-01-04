package br.com.fecorp.reinf.model;


import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@ManagedBean(name="TelaCadastroLogin")
@Entity
@Table(name = "telacadastrologin")
public class TelaCadastroLogin {

	@Id
	@Column(name="nome")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nome;


	@Column
	private String departamento;


	@Column
	private String login;


	@Column
	private String senha;
	
	

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
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

	@Override
	public String toString() {
		return "TelaCadastroLogin [nome=" + nome + ", departamento=" + departamento + ", login=" + login + ", senha="
				+ senha + "]";
	}

    

}
