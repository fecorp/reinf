package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "aluno")
@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = -3889965461279622993L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	//@SequenceGenerator(name="id", sequenceName="id", allocationSize=1)
	private long id;
	private String name;
	private String curso;
	private String periodo;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Long id, String name, String curso, String periodo) {
		super();
		this.id = id;
		this.name = name;
		this.curso = curso;
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
