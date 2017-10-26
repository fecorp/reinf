package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "DadosTelaPesquisa")
@ViewScoped

@Entity
public class DadosTelaPesquisa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private int NotaFiscal;
	private String Empresa;
	private String Filial;
	private double Valor;
	private double DataEntrada;
	private double DataInicio;
	private double DataFim;
	
	public int getNotaFiscal() {
		return NotaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		NotaFiscal = notaFiscal;
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
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public double getDataInicio() {
		return DataInicio;
	}
	public void setDataInicio(double dataInicio) {
		DataInicio = dataInicio;
	}
	public double getDataFim() {
		return DataFim;
	}
	public void setDataFim(double dataFim) {
		DataFim = dataFim;
	}
	public double getDataEntrada() {
		return DataEntrada;
	}
	public void setDataEntrada(double dataEntrada) {
		DataEntrada = dataEntrada;
	}
}

/*
 * karin 26/10/2017
 */
