package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "ComplementoMestreEntrada")
@ViewScoped

@Entity
public class ComplementoMestreEntrada implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
        private String codFilial;
        private String tipoProcesso;
        private String numProcessoAdm;
        private String indicativoSusp;
        private double valorRetencaoPrincipal;
        private String tipoProcesso01;
        private String numProcessoAdm02;
        private String indicativoSusp02;
        private double valorRetencaoAdicional;
        
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
		public String getTipoProcesso() {
			return tipoProcesso;
		}
		public void setTipoProcesso(String tipoProcesso) {
			this.tipoProcesso = tipoProcesso;
		}
		public String getNumProcessoAdm() {
			return numProcessoAdm;
		}
		public void setNumProcessoAdm(String numProcessoAdm) {
			this.numProcessoAdm = numProcessoAdm;
		}
		public String getIndicativoSusp() {
			return indicativoSusp;
		}
		public void setIndicativoSusp(String indicativoSusp) {
			this.indicativoSusp = indicativoSusp;
		}
		public double getValorRetencaoPrincipal() {
			return valorRetencaoPrincipal;
		}
		public void setValorRetencaoPrincipal(double valorRetencaoPrincipal) {
			this.valorRetencaoPrincipal = valorRetencaoPrincipal;
		}
		public String getTipoProcesso01() {
			return tipoProcesso01;
		}
		public void setTipoProcesso01(String tipoProcesso01) {
			this.tipoProcesso01 = tipoProcesso01;
		}
		public String getNumProcessoAdm02() {
			return numProcessoAdm02;
		}
		public void setNumProcessoAdm02(String numProcessoAdm02) {
			this.numProcessoAdm02 = numProcessoAdm02;
		}
		public String getIndicativoSusp02() {
			return indicativoSusp02;
		}
		public void setIndicativoSusp02(String indicativoSusp02) {
			this.indicativoSusp02 = indicativoSusp02;
		}
		public double getValorRetencaoAdicional() {
			return valorRetencaoAdicional;
		}
		public void setValorRetencaoAdicional(double valorRetencaoAdicional) {
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

