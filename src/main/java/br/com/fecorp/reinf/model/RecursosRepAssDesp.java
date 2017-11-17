package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "RecursosRepAssDesp")
@ViewScoped

@Entity
public class RecursosRepAssDesp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
		private String codFilial;
		private String cnpjAssoDespMantemClube;
		private BigDecimal valorBrutoRecursosRepassados;
		private BigDecimal valorRetencaoRecursosRecb;
		private BigDecimal valorRetencaoDeixouSerFeita;
		private BigDecimal codCorrespTipoProc;
		private String numProcessoAdm;
		private BigDecimal codIndiSusp;
		private String codContaAnaliticaContabil;
		private BigDecimal tipoRepasse;
		private String cnpjEmpresaRepassadoraRec;
		private BigDecimal valorBrutoRepasseEfetuado;
		private BigDecimal valorApuracaoRetencaoSofrerAssociacao;
		private BigDecimal valorRetDeixouSerFeitaEmpresa;
		private BigDecimal valorBrutoRecRecebidos;
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
		public String getCnpjAssoDespMantemClube() {
			return cnpjAssoDespMantemClube;
		}
		public void setCnpjAssoDespMantemClube(String cnpjAssoDespMantemClube) {
			this.cnpjAssoDespMantemClube = cnpjAssoDespMantemClube;
		}
		public BigDecimal getValorBrutoRecursosRepassados() {
			return valorBrutoRecursosRepassados;
		}
		public void setValorBrutoRecursosRepassados(BigDecimal valorBrutoRecursosRepassados) {
			this.valorBrutoRecursosRepassados = valorBrutoRecursosRepassados;
		}
		public BigDecimal getValorRetencaoRecursosRecb() {
			return valorRetencaoRecursosRecb;
		}
		public void setValorRetencaoRecursosRecb(BigDecimal valorRetencaoRecursosRecb) {
			this.valorRetencaoRecursosRecb = valorRetencaoRecursosRecb;
		}
		public BigDecimal getValorRetencaoDeixouSerFeita() {
			return valorRetencaoDeixouSerFeita;
		}
		public void setValorRetencaoDeixouSerFeita(BigDecimal valorRetencaoDeixouSerFeita) {
			this.valorRetencaoDeixouSerFeita = valorRetencaoDeixouSerFeita;
		}
		public BigDecimal getCodCorrespTipoProc() {
			return codCorrespTipoProc;
		}
		public void setCodCorrespTipoProc(BigDecimal codCorrespTipoProc) {
			this.codCorrespTipoProc = codCorrespTipoProc;
		}
		public String getNumProcessoAdm() {
			return numProcessoAdm;
		}
		public void setNumProcessoAdm(String numProcessoAdm) {
			this.numProcessoAdm = numProcessoAdm;
		}
		public BigDecimal getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(BigDecimal codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public String getCodContaAnaliticaContabil() {
			return codContaAnaliticaContabil;
		}
		public void setCodContaAnaliticaContabil(String codContaAnaliticaContabil) {
			this.codContaAnaliticaContabil = codContaAnaliticaContabil;
		}
		public BigDecimal getTipoRepasse() {
			return tipoRepasse;
		}
		public void setTipoRepasse(BigDecimal tipoRepasse) {
			this.tipoRepasse = tipoRepasse;
		}
		public String getCnpjEmpresaRepassadoraRec() {
			return cnpjEmpresaRepassadoraRec;
		}
		public void setCnpjEmpresaRepassadoraRec(String cnpjEmpresaRepassadoraRec) {
			this.cnpjEmpresaRepassadoraRec = cnpjEmpresaRepassadoraRec;
		}
		public BigDecimal getValorBrutoRepasseEfetuado() {
			return valorBrutoRepasseEfetuado;
		}
		public void setValorBrutoRepasseEfetuado(BigDecimal valorBrutoRepasseEfetuado) {
			this.valorBrutoRepasseEfetuado = valorBrutoRepasseEfetuado;
		}
		public BigDecimal getValorApuracaoRetencaoSofrerAssociacao() {
			return valorApuracaoRetencaoSofrerAssociacao;
		}
		public void setValorApuracaoRetencaoSofrerAssociacao(BigDecimal valorApuracaoRetencaoSofrerAssociacao) {
			this.valorApuracaoRetencaoSofrerAssociacao = valorApuracaoRetencaoSofrerAssociacao;
		}
		public BigDecimal getValorRetDeixouSerFeitaEmpresa() {
			return valorRetDeixouSerFeitaEmpresa;
		}
		public void setValorRetDeixouSerFeitaEmpresa(BigDecimal valorRetDeixouSerFeitaEmpresa) {
			this.valorRetDeixouSerFeitaEmpresa = valorRetDeixouSerFeitaEmpresa;
		}
		public BigDecimal getValorBrutoRecRecebidos() {
			return valorBrutoRecRecebidos;
		}
		public void setValorBrutoRecRecebidos(BigDecimal valorBrutoRecRecebidos) {
			this.valorBrutoRecRecebidos = valorBrutoRecRecebidos;
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

