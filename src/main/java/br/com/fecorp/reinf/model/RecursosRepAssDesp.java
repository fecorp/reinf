package br.com.fecorp.reinf.model;

import java.io.Serializable;

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
		private double valorBrutoRecursosRepassados;
		private double valorRetencaoRecursosRecb;
		private double valorRetencaoDeixouSerFeita;
		private double codCorrespTipoProc;
		private String numProcessoAdm;
		private double codIndiSusp;
		private String codContaAnaliticaContabil;
		private double tipoRepasse;
		private String cnpjEmpresaRepassadoraRec;
		private double valorBrutoRepasseEfetuado;
		private double valorApuracaoRetencaoSofrerAssociacao;
		private double valorRetDeixouSerFeitaEmpresa;
		private double valorBrutoRecRecebidos;
		private String openFlex01;
		private String openFlex02;

		
		public String getCodEmpresa() {
			return codEmpresa;
		}
		public void setCodEmpresa(String codEmpresa) {
			this.codEmpresa = codEmpresa;
		}
		public double getValorBrutoRecRecebidos() {
			return valorBrutoRecRecebidos;
		}
		public void setValorBrutoRecRecebidos(double valorBrutoRecRecebidos) {
			this.valorBrutoRecRecebidos = valorBrutoRecRecebidos;
		}
		public String getCnpjEmpresaRepassadoraRec() {
			return cnpjEmpresaRepassadoraRec;
		}
		public void setCnpjEmpresaRepassadoraRec(String cnpjEmpresaRepassadoraRec) {
			this.cnpjEmpresaRepassadoraRec = cnpjEmpresaRepassadoraRec;
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
		public double getValorBrutoRecursosRepassados() {
			return valorBrutoRecursosRepassados;
		}
		public void setValorBrutoRecursosRepassados(double valorBrutoRecursosRepassados) {
			this.valorBrutoRecursosRepassados = valorBrutoRecursosRepassados;
		}
		public double getValorRetencaoRecursosRecb() {
			return valorRetencaoRecursosRecb;
		}
		public void setValorRetencaoRecursosRecb(double valorRetencaoRecursosRecb) {
			this.valorRetencaoRecursosRecb = valorRetencaoRecursosRecb;
		}
		public double getValorRetencaoDeixouSerFeita() {
			return valorRetencaoDeixouSerFeita;
		}
		public void setValorRetencaoDeixouSerFeita(double valorRetencaoDeixouSerFeita) {
			this.valorRetencaoDeixouSerFeita = valorRetencaoDeixouSerFeita;
		}
		public double getCodCorrespTipoProc() {
			return codCorrespTipoProc;
		}
		public void setCodCorrespTipoProc(double codCorrespTipoProc) {
			this.codCorrespTipoProc = codCorrespTipoProc;
		}
		public String getNumProcessoAdm() {
			return numProcessoAdm;
		}
		public void setNumProcessoAdm(String numProcessoAdm) {
			this.numProcessoAdm = numProcessoAdm;
		}
		public double getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(double codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public String getCodContaAnaliticaContabil() {
			return codContaAnaliticaContabil;
		}
		public void setCodContaAnaliticaContabil(String codContaAnaliticaContabil) {
			this.codContaAnaliticaContabil = codContaAnaliticaContabil;
		}
		public double getTipoRepasse() {
			return tipoRepasse;
		}
		public void setTipoRepasse(double tipoRepasse) {
			this.tipoRepasse = tipoRepasse;
		}
		public double getValorBrutoRepasseEfetuado() {
			return valorBrutoRepasseEfetuado;
		}
		public void setValorBrutoRepasseEfetuado(double valorBrutoRepasseEfetuado) {
			this.valorBrutoRepasseEfetuado = valorBrutoRepasseEfetuado;
		}
		public double getValorApuracaoRetencaoSofrerAssociacao() {
			return valorApuracaoRetencaoSofrerAssociacao;
		}
		public void setValorApuracaoRetencaoSofrerAssociacao(double valorApuracaoRetencaoSofrerAssociacao) {
			this.valorApuracaoRetencaoSofrerAssociacao = valorApuracaoRetencaoSofrerAssociacao;
		}
		public double getValorRetDeixouSerFeitaEmpresa() {
			return valorRetDeixouSerFeitaEmpresa;
		}
		public void setValorRetDeixouSerFeitaEmpresa(double valorRetDeixouSerFeitaEmpresa) {
			this.valorRetDeixouSerFeitaEmpresa = valorRetDeixouSerFeitaEmpresa;
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

