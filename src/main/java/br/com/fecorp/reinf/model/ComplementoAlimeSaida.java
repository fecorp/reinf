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



@ManagedBean(name = "ComplementoAlimeSaida")
@ViewScoped

@Entity
public class ComplementoAlimeSaida implements Serializable{
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		

	private String codEmpresa;
	private String codFilial;
	private String serieNotaFiscal;
	private String numNotaFiscal;
	
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	private String categoriaPfPj;
	private String retencaoCondEspeciais;
	private String codPfPj;
	private BigDecimal codAtividadeEconomica;
	private BigDecimal custoAlimeForncContratada;
	private BigDecimal custoForncTransp;
	private BigDecimal valorRetencaoServicos;
	private BigDecimal adicionalSobreRetencao;
	private String contribuicao01;
	private String contribuicao02;
	private String contribuicao03;
	private String openFlex01;
	private String openFlex02;
	private BigDecimal valorRetencaoPrincipal;
	private BigDecimal valorRetencaoAdicional;
	
	
	
	
	
	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getCodFilial() {
		return codFilial;
	}

	public void setCodFilial(String codFilial) {
		this.codFilial = codFilial;
	}

	public String getSerieNotaFiscal() {
		return serieNotaFiscal;
	}

	public void setSerieNotaFiscal(String serieNotaFiscal) {
		this.serieNotaFiscal = serieNotaFiscal;
	}

	public String getNumNotaFiscal() {
		return numNotaFiscal;
	}

	public void setNumNotaFiscal(String numNotaFiscal) {
		this.numNotaFiscal = numNotaFiscal;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getCategoriaPfPj() {
		return categoriaPfPj;
	}

	public void setCategoriaPfPj(String categoriaPfPj) {
		this.categoriaPfPj = categoriaPfPj;
	}

	public String getRetencaoCondEspeciais() {
		return retencaoCondEspeciais;
	}

	public void setRetencaoCondEspeciais(String retencaoCondEspeciais) {
		this.retencaoCondEspeciais = retencaoCondEspeciais;
	}

	public String getCodPfPj() {
		return codPfPj;
	}

	public void setCodPfPj(String codPfPj) {
		this.codPfPj = codPfPj;
	}

	public BigDecimal getCodAtividadeEconomica() {
		return codAtividadeEconomica;
	}

	public void setCodAtividadeEconomica(BigDecimal codAtividadeEconomica) {
		this.codAtividadeEconomica = codAtividadeEconomica;
	}

	public BigDecimal getCustoAlimeForncContratada() {
		return custoAlimeForncContratada;
	}

	public void setCustoAlimeForncContratada(BigDecimal custoAlimeForncContratada) {
		this.custoAlimeForncContratada = custoAlimeForncContratada;
	}

	public BigDecimal getCustoForncTransp() {
		return custoForncTransp;
	}

	public void setCustoForncTransp(BigDecimal custoForncTransp) {
		this.custoForncTransp = custoForncTransp;
	}

	public BigDecimal getValorRetencaoServicos() {
		return valorRetencaoServicos;
	}

	public void setValorRetencaoServicos(BigDecimal valorRetencaoServicos) {
		this.valorRetencaoServicos = valorRetencaoServicos;
	}

	public BigDecimal getAdicionalSobreRetencao() {
		return adicionalSobreRetencao;
	}

	public void setAdicionalSobreRetencao(BigDecimal adicionalSobreRetencao) {
		this.adicionalSobreRetencao = adicionalSobreRetencao;
	}

	public String getContribuicao01() {
		return contribuicao01;
	}

	public void setContribuicao01(String contribuicao01) {
		this.contribuicao01 = contribuicao01;
	}

	public String getContribuicao02() {
		return contribuicao02;
	}

	public void setContribuicao02(String contribuicao02) {
		this.contribuicao02 = contribuicao02;
	}

	public String getContribuicao03() {
		return contribuicao03;
	}

	public void setContribuicao03(String contribuicao03) {
		this.contribuicao03 = contribuicao03;
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

	public BigDecimal getValorRetencaoPrincipal() {
		return valorRetencaoPrincipal;
	}

	public void setValorRetencaoPrincipal(BigDecimal valorRetencaoPrincipal) {
		this.valorRetencaoPrincipal = valorRetencaoPrincipal;
	}

	public BigDecimal getValorRetencaoAdicional() {
		return valorRetencaoAdicional;
	}

	public void setValorRetencaoAdicional(BigDecimal valorRetencaoAdicional) {
		this.valorRetencaoAdicional = valorRetencaoAdicional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}
		
   }

