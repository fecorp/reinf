package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@ManagedBean(name = "Pesquisa")
@ViewScoped

@Entity
public class Pesquisa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)


	private String Empresa;
	private String Filial;
	private String Serie;
	private String Numero;
	private String Emissao;
	private String Entrada;
	private String Tipo;
	private String Descri��o;
	private double valor;
	private List<Pesquisa> testaList;

	public Pesquisa(String Empresa, String Filial, String Serie, String Numero, String Emissao, String Entrada,
			String Tipo, String Descri��o, double valor) {
	}

	public List<Pesquisa> getTestalist() {
		return testaList;
	}

	@PostConstruct
	public void init() {
		testaList = new ArrayList<Pesquisa>();

		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));
		testaList.add(new Pesquisa("a ", "b", "c", "d", "e", "f", "7", "8", 1));

	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public String getFilial() {
		return Filial;
	}

	public void setFilial(String filial) {
		Filial = filial;
	}

	public String getSerie() {
		return Serie;
	}

	public void setSerie(String serie) {
		Serie = serie;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getEmissao() {
		return Emissao;
	}

	public void setEmissao(String emissao) {
		Emissao = emissao;
	}

	public String getEntrada() {
		return Entrada;
	}

	public void setEntrada(String entrada) {
		Entrada = entrada;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDescri��o() {
		return Descri��o;
	}

	public void setDescri��o(String descri��o) {
		Descri��o = descri��o;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
