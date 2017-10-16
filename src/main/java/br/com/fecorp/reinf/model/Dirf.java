package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "Dirf")
@ViewScoped

@Entity
public class Dirf implements Serializable, EntidadeBase {

	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Dirf")

	private String codEmpresa;
	private String codFilial;
	private String numNotaFiscal;
	private String serieNotaFiscal;
	private double dataEmissao;
	private String categoriaPfPj;
	private String codigoPfPj;
	private String codParticipante;
	private String codItem;
	private double dataOperacao;
	private String valorOperacao;
	private String codSituacaoTributaria;
	private String baseCalculoPisPasep;
	private String aliquotaPisPasep;
	private String valorPisPasep;
	private String codSituacaoTributariaCofins;
	private String aliquotaCofins;
	private String baseCalculoCsll;
	private String aliquotaCsll;
	private String baseCalculoInss;
	private String aliquotaInss;
	private String valorIss;
	private String naturezaBaseCalculo;
	private String codContaAnaliticaContabil;
	private String codCentroCustos;
	private String descricaoDocumento;
	private String baseCalculoIr;
	private String codPagamento;
	private String aliquotaIr;
	private double valorIr;
	private String nomeRazaoSocial;
	private String tipoBeneficios;
	private String razaoSocialBeneficio;
	private String descricaoResumidaAjustes;
	private String mesAnoReferenciaAjustes;
	private String openFlex01;
	private String openFlex02;

	
	
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}
	public double getValorIr() {
		return valorIr;
	}
	public void setValorIr(double valorIr) {
		this.valorIr = valorIr;
	}
	public String getAliquotaIr() {
		return aliquotaIr;
	}
	public void setAliquotaIr(String aliquotaIr) {
		this.aliquotaIr = aliquotaIr;
	}
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
	
	public String getBaseCalculoIr() {
		return baseCalculoIr;
	}
	public void setBaseCalculoIr(String baseCalculoIr) {
		this.baseCalculoIr = baseCalculoIr;
	}
	public String getNumNotaFiscal() {
		return numNotaFiscal;
	}
	public void setNumNotaFiscal(String numNotaFiscal) {
		this.numNotaFiscal = numNotaFiscal;
	}
	public String getSerieNotaFiscal() {
		return serieNotaFiscal;
	}
	public void setSerieNotaFiscal(String serieNotaFiscal) {
		this.serieNotaFiscal = serieNotaFiscal;
	}
	public double getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(double dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getCategoriaPfPj() {
		return categoriaPfPj;
	}
	public void setCategoriaPfPj(String categoriaPfPj) {
		this.categoriaPfPj = categoriaPfPj;
	}
	public String getCodigoPfPj() {
		return codigoPfPj;
	}
	public void setCodigoPfPj(String codigoPfPj) {
		this.codigoPfPj = codigoPfPj;
	}
	public String getCodParticipante() {
		return codParticipante;
	}
	public void setCodParticipante(String codParticipante) {
		this.codParticipante = codParticipante;
	}
	public String getCodItem() {
		return codItem;
	}
	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}
	public double getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(double dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public String getValorOperacao() {
		return valorOperacao;
	}
	public void setValorOperacao(String valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	public String getCodSituacaoTributaria() {
		return codSituacaoTributaria;
	}
	public void setCodSituacaoTributaria(String codSituacaoTributaria) {
		this.codSituacaoTributaria = codSituacaoTributaria;
	}
	public String getBaseCalculoPisPasep() {
		return baseCalculoPisPasep;
	}
	public void setBaseCalculoPisPasep(String baseCalculoPisPasep) {
		this.baseCalculoPisPasep = baseCalculoPisPasep;
	}
	public String getAliquotaPisPasep() {
		return aliquotaPisPasep;
	}
	public void setAliquotaPisPasep(String aliquotaPisPasep) {
		this.aliquotaPisPasep = aliquotaPisPasep;
	}
	public String getValorPisPasep() {
		return valorPisPasep;
	}
	public void setValorPisPasep(String valorPisPasep) {
		this.valorPisPasep = valorPisPasep;
	}
	public String getCodSituacaoTributariaCofins() {
		return codSituacaoTributariaCofins;
	}
	public void setCodSituacaoTributariaCofins(String codSituacaoTributariaCofins) {
		this.codSituacaoTributariaCofins = codSituacaoTributariaCofins;
	}
	public String getAliquotaCofins() {
		return aliquotaCofins;
	}
	public void setAliquotaCofins(String aliquotaCofins) {
		this.aliquotaCofins = aliquotaCofins;
	}
	public String getBaseCalculoCsll() {
		return baseCalculoCsll;
	}
	public void setBaseCalculoCsll(String baseCalculoCsll) {
		this.baseCalculoCsll = baseCalculoCsll;
	}
	public String getAliquotaCsll() {
		return aliquotaCsll;
	}
	public void setAliquotaCsll(String aliquotaCsll) {
		this.aliquotaCsll = aliquotaCsll;
	}
	public String getBaseCalculoInss() {
		return baseCalculoInss;
	}
	public void setBaseCalculoInss(String baseCalculoInss) {
		this.baseCalculoInss = baseCalculoInss;
	}
	public String getAliquotaInss() {
		return aliquotaInss;
	}
	public void setAliquotaInss(String aliquotaInss) {
		this.aliquotaInss = aliquotaInss;
	}
	public String getValorIss() {
		return valorIss;
	}
	public void setValorIss(String valorIss) {
		this.valorIss = valorIss;
	}
	public String getNaturezaBaseCalculo() {
		return naturezaBaseCalculo;
	}
	public void setNaturezaBaseCalculo(String naturezaBaseCalculo) {
		this.naturezaBaseCalculo = naturezaBaseCalculo;
	}
	public String getCodContaAnaliticaContabil() {
		return codContaAnaliticaContabil;
	}
	public void setCodContaAnaliticaContabil(String codContaAnaliticaContabil) {
		this.codContaAnaliticaContabil = codContaAnaliticaContabil;
	}
	public String getCodCentroCustos() {
		return codCentroCustos;
	}
	public void setCodCentroCustos(String codCentroCustos) {
		this.codCentroCustos = codCentroCustos;
	}
	public String getDescricaoDocumento() {
		return descricaoDocumento;
	}
	public void setDescricaoDocumento(String descricaoDocumento) {
		this.descricaoDocumento = descricaoDocumento;
	}
	public String getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(String codPagamento) {
		this.codPagamento = codPagamento;
	}
	public String getTipoBeneficios() {
		return tipoBeneficios;
	}
	public void setTipoBeneficios(String tipoBeneficios) {
		this.tipoBeneficios = tipoBeneficios;
	}
	public String getRazaoSocialBeneficio() {
		return razaoSocialBeneficio;
	}
	public void setRazaoSocialBeneficio(String razaoSocialBeneficio) {
		this.razaoSocialBeneficio = razaoSocialBeneficio;
	}
	public String getDescricaoResumidaAjustes() {
		return descricaoResumidaAjustes;
	}
	public void setDescricaoResumidaAjustes(String descricaoResumidaAjustes) {
		this.descricaoResumidaAjustes = descricaoResumidaAjustes;
	}
	public String getMesAnoReferenciaAjustes() {
		return mesAnoReferenciaAjustes;
	}
	public void setMesAnoReferenciaAjustes(String mesAnoReferenciaAjustes) {
		this.mesAnoReferenciaAjustes = mesAnoReferenciaAjustes;
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
	public long getSerialversionuid() {
		return serialVersionUID;
	}
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}
}	
