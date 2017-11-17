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

@ManagedBean(name = "CPRB")
@ViewScoped

@Entity
public class Cprb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private String codEmpresa;
	private String codFilial;
	private BigDecimal valorReceitaBrutaTotalEstabelecimento;
	private BigDecimal valorTotalCprbApurada;
	private BigDecimal valorContribuicaoPrevExigiSusp;
	private BigDecimal codCorrespondenteProcesso;
	private String numProcessoAdm;
	private BigDecimal codIndicativoSusp;
	private BigDecimal codIndicadorCorrespComercial;
	private BigDecimal valorTotalReceitaAtividade;
	private BigDecimal valorExclusaoreceitaBruta;
	private BigDecimal valorTotalAdicoesReceitaBruta;
	private BigDecimal valorBaseCalculoContribuicaoPrevReceitaBruta;
	private BigDecimal valorContribPrevReceitaBruta;
	private String codContaAnaliticaContabil;
	private String numSerieNotaFiscal;
	private String numNotaFiscalFatura;
	private Date dataEmissaoNotaFiscal;
	private BigDecimal valorBrutoNotaFiscal;
	private BigDecimal tipoReajuste;
	private BigDecimal codAjuste;
	private BigDecimal valorAjuste;
	private String descResumidaAjuste;
	private String mesAnoReferenciaAjuste;
	private String openFlex01;
	private String openFlex02;
	private String NF;
	private String serie;
	private BigDecimal valorCprbApurada;

	

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



	public BigDecimal getValorReceitaBrutaTotalEstabelecimento() {
		return valorReceitaBrutaTotalEstabelecimento;
	}



	public void setValorReceitaBrutaTotalEstabelecimento(BigDecimal valorReceitaBrutaTotalEstabelecimento) {
		this.valorReceitaBrutaTotalEstabelecimento = valorReceitaBrutaTotalEstabelecimento;
	}



	public BigDecimal getValorTotalCprbApurada() {
		return valorTotalCprbApurada;
	}



	public void setValorTotalCprbApurada(BigDecimal valorTotalCprbApurada) {
		this.valorTotalCprbApurada = valorTotalCprbApurada;
	}



	public BigDecimal getValorContribuicaoPrevExigiSusp() {
		return valorContribuicaoPrevExigiSusp;
	}



	public void setValorContribuicaoPrevExigiSusp(BigDecimal valorContribuicaoPrevExigiSusp) {
		this.valorContribuicaoPrevExigiSusp = valorContribuicaoPrevExigiSusp;
	}



	public BigDecimal getCodCorrespondenteProcesso() {
		return codCorrespondenteProcesso;
	}



	public void setCodCorrespondenteProcesso(BigDecimal codCorrespondenteProcesso) {
		this.codCorrespondenteProcesso = codCorrespondenteProcesso;
	}



	public String getNumProcessoAdm() {
		return numProcessoAdm;
	}



	public void setNumProcessoAdm(String numProcessoAdm) {
		this.numProcessoAdm = numProcessoAdm;
	}



	public BigDecimal getCodIndicativoSusp() {
		return codIndicativoSusp;
	}



	public void setCodIndicativoSusp(BigDecimal codIndicativoSusp) {
		this.codIndicativoSusp = codIndicativoSusp;
	}



	public BigDecimal getCodIndicadorCorrespComercial() {
		return codIndicadorCorrespComercial;
	}



	public void setCodIndicadorCorrespComercial(BigDecimal codIndicadorCorrespComercial) {
		this.codIndicadorCorrespComercial = codIndicadorCorrespComercial;
	}



	public BigDecimal getValorTotalReceitaAtividade() {
		return valorTotalReceitaAtividade;
	}



	public void setValorTotalReceitaAtividade(BigDecimal valorTotalReceitaAtividade) {
		this.valorTotalReceitaAtividade = valorTotalReceitaAtividade;
	}



	public BigDecimal getValorExclusaoreceitaBruta() {
		return valorExclusaoreceitaBruta;
	}



	public void setValorExclusaoreceitaBruta(BigDecimal valorExclusaoreceitaBruta) {
		this.valorExclusaoreceitaBruta = valorExclusaoreceitaBruta;
	}



	public BigDecimal getValorTotalAdicoesReceitaBruta() {
		return valorTotalAdicoesReceitaBruta;
	}



	public void setValorTotalAdicoesReceitaBruta(BigDecimal valorTotalAdicoesReceitaBruta) {
		this.valorTotalAdicoesReceitaBruta = valorTotalAdicoesReceitaBruta;
	}



	public BigDecimal getValorBaseCalculoContribuicaoPrevReceitaBruta() {
		return valorBaseCalculoContribuicaoPrevReceitaBruta;
	}



	public void setValorBaseCalculoContribuicaoPrevReceitaBruta(BigDecimal valorBaseCalculoContribuicaoPrevReceitaBruta) {
		this.valorBaseCalculoContribuicaoPrevReceitaBruta = valorBaseCalculoContribuicaoPrevReceitaBruta;
	}



	public BigDecimal getValorContribPrevReceitaBruta() {
		return valorContribPrevReceitaBruta;
	}



	public void setValorContribPrevReceitaBruta(BigDecimal valorContribPrevReceitaBruta) {
		this.valorContribPrevReceitaBruta = valorContribPrevReceitaBruta;
	}



	public String getCodContaAnaliticaContabil() {
		return codContaAnaliticaContabil;
	}



	public void setCodContaAnaliticaContabil(String codContaAnaliticaContabil) {
		this.codContaAnaliticaContabil = codContaAnaliticaContabil;
	}



	public String getNumSerieNotaFiscal() {
		return numSerieNotaFiscal;
	}



	public void setNumSerieNotaFiscal(String numSerieNotaFiscal) {
		this.numSerieNotaFiscal = numSerieNotaFiscal;
	}



	public String getNumNotaFiscalFatura() {
		return numNotaFiscalFatura;
	}



	public void setNumNotaFiscalFatura(String numNotaFiscalFatura) {
		this.numNotaFiscalFatura = numNotaFiscalFatura;
	}



	public Date getDataEmissaoNotaFiscal() {
		return dataEmissaoNotaFiscal;
	}



	public void setDataEmissaoNotaFiscal(Date dataEmissaoNotaFiscal) {
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
	}



	public BigDecimal getValorBrutoNotaFiscal() {
		return valorBrutoNotaFiscal;
	}



	public void setValorBrutoNotaFiscal(BigDecimal valorBrutoNotaFiscal) {
		this.valorBrutoNotaFiscal = valorBrutoNotaFiscal;
	}



	public BigDecimal getTipoReajuste() {
		return tipoReajuste;
	}



	public void setTipoReajuste(BigDecimal tipoReajuste) {
		this.tipoReajuste = tipoReajuste;
	}



	public BigDecimal getCodAjuste() {
		return codAjuste;
	}



	public void setCodAjuste(BigDecimal codAjuste) {
		this.codAjuste = codAjuste;
	}



	public BigDecimal getValorAjuste() {
		return valorAjuste;
	}



	public void setValorAjuste(BigDecimal valorAjuste) {
		this.valorAjuste = valorAjuste;
	}



	public String getDescResumidaAjuste() {
		return descResumidaAjuste;
	}



	public void setDescResumidaAjuste(String descResumidaAjuste) {
		this.descResumidaAjuste = descResumidaAjuste;
	}



	public String getMesAnoReferenciaAjuste() {
		return mesAnoReferenciaAjuste;
	}



	public void setMesAnoReferenciaAjuste(String mesAnoReferenciaAjuste) {
		this.mesAnoReferenciaAjuste = mesAnoReferenciaAjuste;
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



	public String getNF() {
		return NF;
	}



	public void setNF(String nF) {
		NF = nF;
	}



	public String getSerie() {
		return serie;
	}



	public void setSerie(String serie) {
		this.serie = serie;
	}



	public BigDecimal getValorCprbApurada() {
		return valorCprbApurada;
	}



	public void setValorCprbApurada(BigDecimal valorCprbApurada) {
		this.valorCprbApurada = valorCprbApurada;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
