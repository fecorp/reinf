package br.com.fecorp.reinf.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "RecursosRecbAssDep")
@ViewScoped

@Entity
public class RecursosRecbAssDep implements Serializable, EntidadeBase {
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RecursosRecbAssDep")

		private String codEmpresa;
		private String codFilial;
		private String cnpjEmpresaRepasRecursos;
		private double valorBrutoRecursosRecebidos;
		private double valorRetencaoRecursosRecebidos;
		private double valorRetencaoDeixouDeSerFeita;
		private double codCorrespondenteTipoProc;
		private String numProcessoAdm;
		private double codIndicativoSusp;
		private String codContaAnaliticaContabil;
		private double tipoRepasse;
		private double valorBrutoRepasseEfetuado;
		private double valorApuracaoRetencaoSofrerAssociacao;
		private double valorRetDeixouSerFeitaEmpresa;
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
		public double getValorBrutoRecursosRecebidos() {
			return valorBrutoRecursosRecebidos;
		}
		public void setValorBrutoRecursosRecebidos(double valorBrutoRecursosRecebidos) {
			this.valorBrutoRecursosRecebidos = valorBrutoRecursosRecebidos;
		}
		public double getValorRetencaoRecursosRecebidos() {
			return valorRetencaoRecursosRecebidos;
		}
		public void setValorRetencaoRecursosRecebidos(double valorRetencaoRecursosRecebidos) {
			this.valorRetencaoRecursosRecebidos = valorRetencaoRecursosRecebidos;
		}
		public double getValorRetencaoDeixouDeSerFeita() {
			return valorRetencaoDeixouDeSerFeita;
		}
		public void setValorRetencaoDeixouDeSerFeita(double valorRetencaoDeixouDeSerFeita) {
			this.valorRetencaoDeixouDeSerFeita = valorRetencaoDeixouDeSerFeita;
		}
		public double getCodCorrespondenteTipoProc() {
			return codCorrespondenteTipoProc;
		}
		public void setCodCorrespondenteTipoProc(double codCorrespondenteTipoProc) {
			this.codCorrespondenteTipoProc = codCorrespondenteTipoProc;
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

