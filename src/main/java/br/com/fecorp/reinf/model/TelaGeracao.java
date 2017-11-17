package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "TelaGeracao")
@ViewScoped

@Entity
public class TelaGeracao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private String empresa;
	private String filial;
	private String periodo;
	private boolean oficial;
	private boolean retificacao;
	private BigDecimal quantidade;
	private String lotes;
	private boolean sim;
	private boolean nao;
	private BigDecimal num01;
	private BigDecimal num02;
	private BigDecimal num03;
	private BigDecimal num04;
	private BigDecimal num05;
	private String recibo;
	private String reciboAnterior;
	
	
	
	
	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}




	public String getFilial() {
		return filial;
	}




	public void setFilial(String filial) {
		this.filial = filial;
	}




	public String getPeriodo() {
		return periodo;
	}




	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}




	public boolean isOficial() {
		return oficial;
	}




	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}




	public boolean isRetificacao() {
		return retificacao;
	}




	public void setRetificacao(boolean retificacao) {
		this.retificacao = retificacao;
	}




	public BigDecimal getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}




	public String getLotes() {
		return lotes;
	}




	public void setLotes(String lotes) {
		this.lotes = lotes;
	}




	public boolean isSim() {
		return sim;
	}




	public void setSim(boolean sim) {
		this.sim = sim;
	}




	public boolean isNao() {
		return nao;
	}




	public void setNao(boolean nao) {
		this.nao = nao;
	}




	public BigDecimal getNum01() {
		return num01;
	}




	public void setNum01(BigDecimal num01) {
		this.num01 = num01;
	}




	public BigDecimal getNum02() {
		return num02;
	}




	public void setNum02(BigDecimal num02) {
		this.num02 = num02;
	}




	public BigDecimal getNum03() {
		return num03;
	}




	public void setNum03(BigDecimal num03) {
		this.num03 = num03;
	}




	public BigDecimal getNum04() {
		return num04;
	}




	public void setNum04(BigDecimal num04) {
		this.num04 = num04;
	}




	public BigDecimal getNum05() {
		return num05;
	}




	public void setNum05(BigDecimal num05) {
		this.num05 = num05;
	}




	public String getRecibo() {
		return recibo;
	}




	public void setRecibo(String recibo) {
		this.recibo = recibo;
	}




	public String getReciboAnterior() {
		return reciboAnterior;
	}




	public void setReciboAnterior(String reciboAnterior) {
		this.reciboAnterior = reciboAnterior;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
