package br.com.fecorp.reinf.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "comercializacaoAgro")
@ViewScoped

@Entity
public class comercializacaoAgro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
		private String codEmpresa;
		private String codFilial;
		private double codTipoInscricao;
		private String numInscricaoEstabelecimento;
		private double valorReceitaBrutaTotal;
		private double valorContribuicaoPrev;
		private double valorContribPrevGilrat;
		private double valorContribSenar;
		private double indicativoComercializacao;
		private double valorComercializacao;
		private String codContaAnaliticaContabil;
		private String numSerieNotaFiscal;
		private String numNotaFiscal;
		private double dataEmissaoNotaFiscal;
		private double valorBrutoNotaFiscal;
		private double codTipoProcesso;
		private String numProcessoAdm;
		private double codIndicativoSusp;
		private double valorContribPrevExigiSusp;
		private double valorContribGilratPrevExigiSusp;
		private double valorContribSenarPrevExigiSusp;
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
		public double getCodTipoInscricao() {
			return codTipoInscricao;
		}
		public void setCodTipoInscricao(double codTipoInscricao) {
			this.codTipoInscricao = codTipoInscricao;
		}
		public String getNumInscricaoEstabelecimento() {
			return numInscricaoEstabelecimento;
		}
		public void setNumInscricaoEstabelecimento(String numInscricaoEstabelecimento) {
			this.numInscricaoEstabelecimento = numInscricaoEstabelecimento;
		}
		public double getValorReceitaBrutaTotal() {
			return valorReceitaBrutaTotal;
		}
		public void setValorReceitaBrutaTotal(double valorReceitaBrutaTotal) {
			this.valorReceitaBrutaTotal = valorReceitaBrutaTotal;
		}
		public double getValorContribuicaoPrev() {
			return valorContribuicaoPrev;
		}
		public void setValorContribuicaoPrev(double valorContribuicaoPrev) {
			this.valorContribuicaoPrev = valorContribuicaoPrev;
		}
		public double getValorContribPrevGilrat() {
			return valorContribPrevGilrat;
		}
		public void setValorContribPrevGilrat(double valorContribPrevGilrat) {
			this.valorContribPrevGilrat = valorContribPrevGilrat;
		}
		public double getValorContribSenar() {
			return valorContribSenar;
		}
		public void setValorContribSenar(double valorContribSenar) {
			this.valorContribSenar = valorContribSenar;
		}
		public double getIndicativoComercializacao() {
			return indicativoComercializacao;
		}
		public void setIndicativoComercializacao(double indicativoComercializacao) {
			this.indicativoComercializacao = indicativoComercializacao;
		}
		public double getValorComercializacao() {
			return valorComercializacao;
		}
		public void setValorComercializacao(double valorComercializacao) {
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
		public double getCodTipoProcesso() {
			return codTipoProcesso;
		}
		public void setCodTipoProcesso(double codTipoProcesso) {
			this.codTipoProcesso = codTipoProcesso;
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
		public double getValorContribPrevExigiSusp() {
			return valorContribPrevExigiSusp;
		}
		public void setValorContribPrevExigiSusp(double valorContribPrevExigiSusp) {
			this.valorContribPrevExigiSusp = valorContribPrevExigiSusp;
		}
		public double getValorContribGilratPrevExigiSusp() {
			return valorContribGilratPrevExigiSusp;
		}
		public void setValorContribGilratPrevExigiSusp(double valorContribGilratPrevExigiSusp) {
			this.valorContribGilratPrevExigiSusp = valorContribGilratPrevExigiSusp;
		}
		public double getValorContribSenarPrevExigiSusp() {
			return valorContribSenarPrevExigiSusp;
		}
		public void setValorContribSenarPrevExigiSusp(double valorContribSenarPrevExigiSusp) {
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

