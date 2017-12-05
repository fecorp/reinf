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

@ManagedBean(name = "comercializacaoAgro")
@ViewScoped

@Entity
public class comercializacaoAgro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
		private String codEmpresa;
		private String codFilial;
		private BigDecimal codTipoInscricao;
		private String numInscricaoEstabelecimento;
		private BigDecimal valorReceitaBrutaTotal;
		private BigDecimal valorContribuicaoPrev;
		private BigDecimal valorContribPrevGilrat;
		private BigDecimal valorContribSenar;
		private BigDecimal indicativoComercializacao;
		private BigDecimal valorComercializacao;
		private String codContaAnaliticaContabil;
		private String numSerieNotaFiscal;
		private String numNotaFiscal;
		
		@Temporal(TemporalType.DATE)
		private Date dataEmissaoNotaFiscal;
		private BigDecimal valorBrutoNotaFiscal;
		private BigDecimal codTipoProcesso;
		private String numProcessoAdm;
		private BigDecimal codIndicativoSusp;
		private BigDecimal valorContribPrevExigiSusp;
		private BigDecimal valorContribGilratPrevExigiSusp;
		private BigDecimal valorContribSenarPrevExigiSusp;
		private String openFlex01;
		private String openFlex02;
		
		
		
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
		public BigDecimal getCodTipoInscricao() {
			return codTipoInscricao;
		}
		public void setCodTipoInscricao(BigDecimal codTipoInscricao) {
			this.codTipoInscricao = codTipoInscricao;
		}
		public String getNumInscricaoEstabelecimento() {
			return numInscricaoEstabelecimento;
		}
		public void setNumInscricaoEstabelecimento(String numInscricaoEstabelecimento) {
			this.numInscricaoEstabelecimento = numInscricaoEstabelecimento;
		}
		public BigDecimal getValorReceitaBrutaTotal() {
			return valorReceitaBrutaTotal;
		}
		public void setValorReceitaBrutaTotal(BigDecimal valorReceitaBrutaTotal) {
			this.valorReceitaBrutaTotal = valorReceitaBrutaTotal;
		}
		public BigDecimal getValorContribuicaoPrev() {
			return valorContribuicaoPrev;
		}
		public void setValorContribuicaoPrev(BigDecimal valorContribuicaoPrev) {
			this.valorContribuicaoPrev = valorContribuicaoPrev;
		}
		public BigDecimal getValorContribPrevGilrat() {
			return valorContribPrevGilrat;
		}
		public void setValorContribPrevGilrat(BigDecimal valorContribPrevGilrat) {
			this.valorContribPrevGilrat = valorContribPrevGilrat;
		}
		public BigDecimal getValorContribSenar() {
			return valorContribSenar;
		}
		public void setValorContribSenar(BigDecimal valorContribSenar) {
			this.valorContribSenar = valorContribSenar;
		}
		public BigDecimal getIndicativoComercializacao() {
			return indicativoComercializacao;
		}
		public void setIndicativoComercializacao(BigDecimal indicativoComercializacao) {
			this.indicativoComercializacao = indicativoComercializacao;
		}
		public BigDecimal getValorComercializacao() {
			return valorComercializacao;
		}
		public void setValorComercializacao(BigDecimal valorComercializacao) {
			this.valorComercializacao = valorComercializacao;
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
		public String getNumNotaFiscal() {
			return numNotaFiscal;
		}
		public void setNumNotaFiscal(String numNotaFiscal) {
			this.numNotaFiscal = numNotaFiscal;
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
		public BigDecimal getCodTipoProcesso() {
			return codTipoProcesso;
		}
		public void setCodTipoProcesso(BigDecimal codTipoProcesso) {
			this.codTipoProcesso = codTipoProcesso;
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
		public BigDecimal getValorContribPrevExigiSusp() {
			return valorContribPrevExigiSusp;
		}
		public void setValorContribPrevExigiSusp(BigDecimal valorContribPrevExigiSusp) {
			this.valorContribPrevExigiSusp = valorContribPrevExigiSusp;
		}
		public BigDecimal getValorContribGilratPrevExigiSusp() {
			return valorContribGilratPrevExigiSusp;
		}
		public void setValorContribGilratPrevExigiSusp(BigDecimal valorContribGilratPrevExigiSusp) {
			this.valorContribGilratPrevExigiSusp = valorContribGilratPrevExigiSusp;
		}
		public BigDecimal getValorContribSenarPrevExigiSusp() {
			return valorContribSenarPrevExigiSusp;
		}
		public void setValorContribSenarPrevExigiSusp(BigDecimal valorContribSenarPrevExigiSusp) {
			this.valorContribSenarPrevExigiSusp = valorContribSenarPrevExigiSusp;
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

