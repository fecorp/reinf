package br.com.fecorp.reinf.model;

import java.io.Serializable;

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
	private double valorReceitaBrutaTotalEstabelecimento;
	private double valorTotalCprbApurada;
	private double valorContribuicaoPrevExigiSusp;
	private double codCorrespondenteProcesso;
	private String numProcessoAdm;
	private double codIndicativoSusp;
	private double codIndicadorCorrespComercial;
	private double valorTotalReceitaAtividade;
	private double valorExclusaoreceitaBruta;
	private double valorTotalAdicoesReceitaBruta;
	private double valorBaseCalculoContribuicaoPrevReceitaBruta;
	private double valorContribPrevReceitaBruta;
	private String codContaAnaliticaContabil;
	private String numSerieNotaFiscal;
	private String numNotaFiscalFatura;
	private double dataEmissaoNotaFiscal;
	private double valorBrutoNotaFiscal;
	private double tipoReajuste;
	private double codAjuste;
	private double valorAjuste;
	private String descResumidaAjuste;
	private String mesAnoReferenciaAjuste;
	private String openFlex01;
	private String openFlex02;
	private String NF;
	private String serie;
	private double valorCprbApurada;

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

	public double getValorReceitaBrutaTotalEstabelecimento() {
		return valorReceitaBrutaTotalEstabelecimento;
	}

	public void setValorReceitaBrutaTotalEstabelecimento(double valorReceitaBrutaTotalEstabelecimento) {
		this.valorReceitaBrutaTotalEstabelecimento = valorReceitaBrutaTotalEstabelecimento;
	}

	public double getValorTotalCprbApurada() {
		return valorTotalCprbApurada;
	}

	public void setValorTotalCprbApurada(double valorTotalCprbApurada) {
		this.valorTotalCprbApurada = valorTotalCprbApurada;
	}

	public double getValorContribuicaoPrevExigiSusp() {
		return valorContribuicaoPrevExigiSusp;
	}

	public void setValorContribuicaoPrevExigiSusp(double valorContribuicaoPrevExigiSusp) {
		this.valorContribuicaoPrevExigiSusp = valorContribuicaoPrevExigiSusp;
	}

	public double getCodCorrespondenteProcesso() {
		return codCorrespondenteProcesso;
	}

	public void setCodCorrespondenteProcesso(double codCorrespondenteProcesso) {
		this.codCorrespondenteProcesso = codCorrespondenteProcesso;
	}

	public String getNumProcessoAdm() {
		return numProcessoAdm;
	}

	public void setNumProcessoAdm(String numProcessoAdm) {
		this.numProcessoAdm = numProcessoAdm;
	}

	public double getCodIndicativoSusp() {
		return codIndicativoSusp;
	}

	public void setCodIndicativoSusp(double codIndicativoSusp) {
		this.codIndicativoSusp = codIndicativoSusp;
	}

	public double getCodIndicadorCorrespComercial() {
		return codIndicadorCorrespComercial;
	}

	public void setCodIndicadorCorrespComercial(double codIndicadorCorrespComercial) {
		this.codIndicadorCorrespComercial = codIndicadorCorrespComercial;
	}

	public double getValorTotalReceitaAtividade() {
		return valorTotalReceitaAtividade;
	}

	public void setValorTotalReceitaAtividade(double valorTotalReceitaAtividade) {
		this.valorTotalReceitaAtividade = valorTotalReceitaAtividade;
	}

	public double getValorExclusaoreceitaBruta() {
		return valorExclusaoreceitaBruta;
	}

	public void setValorExclusaoreceitaBruta(double valorExclusaoreceitaBruta) {
		this.valorExclusaoreceitaBruta = valorExclusaoreceitaBruta;
	}

	public double getValorTotalAdicoesReceitaBruta() {
		return valorTotalAdicoesReceitaBruta;
	}

	public void setValorTotalAdicoesReceitaBruta(double valorTotalAdicoesReceitaBruta) {
		this.valorTotalAdicoesReceitaBruta = valorTotalAdicoesReceitaBruta;
	}

	public double getValorBaseCalculoContribuicaoPrevReceitaBruta() {
		return valorBaseCalculoContribuicaoPrevReceitaBruta;
	}

	public void setValorBaseCalculoContribuicaoPrevReceitaBruta(double valorBaseCalculoContribuicaoPrevReceitaBruta) {
		this.valorBaseCalculoContribuicaoPrevReceitaBruta = valorBaseCalculoContribuicaoPrevReceitaBruta;
	}

	public double getValorContribPrevReceitaBruta() {
		return valorContribPrevReceitaBruta;
	}

	public void setValorContribPrevReceitaBruta(double valorContribPrevReceitaBruta) {
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

	public double getDataEmissaoNotaFiscal() {
		return dataEmissaoNotaFiscal;
	}

	public void setDataEmissaoNotaFiscal(double dataEmissaoNotaFiscal) {
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
	}

	public double getValorBrutoNotaFiscal() {
		return valorBrutoNotaFiscal;
	}

	public void setValorBrutoNotaFiscal(double valorBrutoNotaFiscal) {
		this.valorBrutoNotaFiscal = valorBrutoNotaFiscal;
	}

	public double getTipoReajuste() {
		return tipoReajuste;
	}

	public void setTipoReajuste(double tipoReajuste) {
		this.tipoReajuste = tipoReajuste;
	}

	public double getCodAjuste() {
		return codAjuste;
	}

	public void setCodAjuste(double codAjuste) {
		this.codAjuste = codAjuste;
	}

	public double getValorAjuste() {
		return valorAjuste;
	}

	public void setValorAjuste(double valorAjuste) {
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

	public double getValorCprbApurada() {
		return valorCprbApurada;
	}

	public void setValorCprbApurada(double valorCprbApurada) {
		this.valorCprbApurada = valorCprbApurada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
