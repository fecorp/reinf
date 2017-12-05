package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Temporal(TemporalType.DATE)
	private Date DataEntrada;
	
	@Temporal(TemporalType.DATE)
	private Date DataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date DataFim;
	
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
	public Date getDataEntrada() {
		return DataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		DataEntrada = dataEntrada;
	}
	public Date getDataInicio() {
		return DataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		DataInicio = dataInicio;
	}
	public Date getDataFim() {
		return DataFim;
	}
	public void setDataFim(Date dataFim) {
		DataFim = dataFim;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

