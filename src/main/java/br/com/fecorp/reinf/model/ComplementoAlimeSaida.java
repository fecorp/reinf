package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

public class ComplementoAlimeSaida {

	@Entity
	public class ComplementoAlimeSaida_ implements Serializable, EntidadeBase {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ComplementoAlimeSaida")
		
		private String codEmpresa;
		private String codFilial;
		private String tipoProcessoPrinc;
		private String numProcAdmJudPrinc;
		private String indicativoSuspensaoPrinc;
		private String tipoProcessoAdc;
		private String numProcAdmJudAdc;
		private String indicativoSuspensaoAdc;
		private double valorRetencaoPrincipal;
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
		public String getTipoProcessoPrinc() {
			return tipoProcessoPrinc;
		}
		public void setTipoProcessoPrinc(String tipoProcessoPrinc) {
			this.tipoProcessoPrinc = tipoProcessoPrinc;
		}
		public String getNumProcAdmJudPrinc() {
			return numProcAdmJudPrinc;
		}
		public void setNumProcAdmJudPrinc(String numProcAdmJudPrinc) {
			this.numProcAdmJudPrinc = numProcAdmJudPrinc;
		}
		public String getIndicativoSuspensaoPrinc() {
			return indicativoSuspensaoPrinc;
		}
		public void setIndicativoSuspensaoPrinc(String indicativoSuspensaoPrinc) {
			this.indicativoSuspensaoPrinc = indicativoSuspensaoPrinc;
		}
		public String getTipoProcessoAdc() {
			return tipoProcessoAdc;
		}
		public void setTipoProcessoAdc(String tipoProcessoAdc) {
			this.tipoProcessoAdc = tipoProcessoAdc;
		}
		public String getNumProcAdmJudAdc() {
			return numProcAdmJudAdc;
		}
		public void setNumProcAdmJudAdc(String numProcAdmJudAdc) {
			this.numProcAdmJudAdc = numProcAdmJudAdc;
		}
		public String getIndicativoSuspensaoAdc() {
			return indicativoSuspensaoAdc;
		}
		public void setIndicativoSuspensaoAdc(String indicativoSuspensaoAdc) {
			this.indicativoSuspensaoAdc = indicativoSuspensaoAdc;
		}
		public double getValorRetencaoPrincipal() {
			return valorRetencaoPrincipal;
		}
		public void setValorRetencaoPrincipal(double valorRetencaoPrincipal) {
			this.valorRetencaoPrincipal = valorRetencaoPrincipal;
		}
		public double getValorRetencaoAdicional() {
			return valorRetencaoAdicional;
		}
		public void setValorRetencaoAdicional(double valorRetencaoAdicional) {
			this.valorRetencaoAdicional = valorRetencaoAdicional;
		}
		public long getSerialversionuid() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
   }
}
