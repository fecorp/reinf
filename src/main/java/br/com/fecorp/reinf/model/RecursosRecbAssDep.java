package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "RecursosRecbAssDep")
@ViewScoped

@Entity
public class RecursosRecbAssDep implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
		private String codFilial;
		private String cnpjEmpresaRepasRecursos;
		private BigDecimal valorBrutoRecursosRecebidos;
		private BigDecimal valorRetencaoRecursosRecebidos;
		private BigDecimal valorRetencaoDeixouDeSerFeita;
		private BigDecimal codCorrespondenteTipoProc;
		private String numProcessoAdm;
		private BigDecimal codIndicativoSusp;
		private String codContaAnaliticaContabil;
		private BigDecimal tipoRepasse;
		private BigDecimal valorBrutoRepasseEfetuado;
		private BigDecimal valorApuracaoRetencaoSofrerAssociacao;
		private BigDecimal valorRetDeixouSerFeitaEmpresa;
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
		public String getCnpjEmpresaRepasRecursos() {
			return cnpjEmpresaRepasRecursos;
		}
		public void setCnpjEmpresaRepasRecursos(String cnpjEmpresaRepasRecursos) {
			this.cnpjEmpresaRepasRecursos = cnpjEmpresaRepasRecursos;
		}
		public BigDecimal getValorBrutoRecursosRecebidos() {
			return valorBrutoRecursosRecebidos;
		}
		public void setValorBrutoRecursosRecebidos(BigDecimal valorBrutoRecursosRecebidos) {
			this.valorBrutoRecursosRecebidos = valorBrutoRecursosRecebidos;
		}
		public BigDecimal getValorRetencaoRecursosRecebidos() {
			return valorRetencaoRecursosRecebidos;
		}
		public void setValorRetencaoRecursosRecebidos(BigDecimal valorRetencaoRecursosRecebidos) {
			this.valorRetencaoRecursosRecebidos = valorRetencaoRecursosRecebidos;
		}
		public BigDecimal getValorRetencaoDeixouDeSerFeita() {
			return valorRetencaoDeixouDeSerFeita;
		}
		public void setValorRetencaoDeixouDeSerFeita(BigDecimal valorRetencaoDeixouDeSerFeita) {
			this.valorRetencaoDeixouDeSerFeita = valorRetencaoDeixouDeSerFeita;
		}
		public BigDecimal getCodCorrespondenteTipoProc() {
			return codCorrespondenteTipoProc;
		}
		public void setCodCorrespondenteTipoProc(BigDecimal codCorrespondenteTipoProc) {
			this.codCorrespondenteTipoProc = codCorrespondenteTipoProc;
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

