package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@ManagedBean
@Entity
@Table(name="Servicos")


public class TelaServicos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "empresa", nullable = false, unique = true)
	private String empresa;
	@Column(name="codFilial", nullable= false)
	private String codFilial;
	private int codServicos;
	@Temporal(TemporalType.DATE)
	private Calendar dataAtualizacao;
	private String descServico;
	private String complemento;
	private String codLc;
	private String indTipServico;
	private String indTipReceita;
	private String openFlex01;
	private String openFlex02;
	
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCodFilial() {
		return codFilial;
	}
	public void setCodFilial(String codFilial) {
		this.codFilial = codFilial;
	}
	public int getCodServicos() {
		return codServicos;
	}
	public void setCodServicos(int codServicos) {
		this.codServicos = codServicos;
	}
	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getDescServico() {
		return descServico;
	}
	public void setDescServico(String descServico) {
		this.descServico = descServico;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCodLc() {
		return codLc;
	}
	public void setCodLc(String codLc) {
		this.codLc = codLc;
	}
	public String getIndTipServico() {
		return indTipServico;
	}
	public void setIndTipServico(String indTipServico) {
		this.indTipServico = indTipServico;
	}
	public String getIndTipReceita() {
		return indTipReceita;
	}
	public void setIndTipReceita(String indTipReceita) {
		this.indTipReceita = indTipReceita;
	}
	public String getOpenFlex01() {
		return openFlex01;
	}
	public void setOpenFlex01(String openFlex01) {
		this.openFlex01 = openFlex01;
	}
	public String getOpenFlex02() {
		return openFlex02;
	}
	public void setOpenFlex02(String openFlex02) {
		this.openFlex02 = openFlex02;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
	
}
