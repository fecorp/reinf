package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

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

	private double NotaFiscal;
	private String Empresa;
	private String Filial;
	private BigDecimal Valor;
	private BigDecimal DataEntrada;
	private BigDecimal DataInicio;
	private BigDecimal DataFim;
	
	public double getNotaFiscal() {
		return NotaFiscal;
	}
	public void setNotaFiscal(double notaFiscal) {
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
	public BigDecimal getValor() {
		return Valor;
	}
	public void setValor(BigDecimal valor) {
		Valor = valor;
	}
	public BigDecimal getDataEntrada() {
		return DataEntrada;
	}
	public void setDataEntrada(BigDecimal dataEntrada) {
		DataEntrada = dataEntrada;
	}
	public BigDecimal getDataInicio() {
		return DataInicio;
	}
	public void setDataInicio(BigDecimal dataInicio) {
		DataInicio = dataInicio;
	}
	public BigDecimal getDataFim() {
		return DataFim;
	}
	public void setDataFim(BigDecimal dataFim) {
		DataFim = dataFim;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

