package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

public class Cprb {
	
	@Entity
	public class CPRB implements Serializable, EntidadeBase {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Cprb")
		
		private String codEmpresa;
		private String codFilial;
		private String numProcAdm;
		private String codContaAnalContab;
		private String numSerieNotaFiscal;
		private String numNotaFiscal;
		private String descResumidaAjuste;
		private String mesAnoRefAjuste;
		private String openFlex01;
		private String openFlex02;
		private double valorReceitaBruTotal;
		private double valorTotalCprb;
		private double valorContriPrevExigiSusp;
		private long codTipoProc;
		private double codIndiSusp;
		private double codIndiComerc;
		private double valorTotalReceita;
		private double valorTotalExclusoes;
		private double valorTotalAdicoes;
		private double valorBaseCprb;
		private double valorContribPrev;
		private double dataEmissaoNotaFisc;
		private double valorBrutoNotafisc;
		private double tipoAjuste;
		private double codAjuste;
		private double valorAjuste;
		
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
		public String getNumProcAdm() {
			return numProcAdm;
		}
		public void setNumProcAdm(String numProcAdm) {
			this.numProcAdm = numProcAdm;
		}
		public String getCodContaAnalContab() {
			return codContaAnalContab;
		}
		public void setCodContaAnalContab(String codContaAnalContab) {
			this.codContaAnalContab = codContaAnalContab;
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
		public String getDescResumidaAjuste() {
			return descResumidaAjuste;
		}
		public void setDescResumidaAjuste(String descResumidaAjuste) {
			this.descResumidaAjuste = descResumidaAjuste;
		}
		public String getMesAnoRefAjuste() {
			return mesAnoRefAjuste;
		}
		public void setMesAnoRefAjuste(String mesAnoRefAjuste) {
			this.mesAnoRefAjuste = mesAnoRefAjuste;
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
		public double getValorReceitaBruTotal() {
			return valorReceitaBruTotal;
		}
		public void setValorReceitaBruTotal(double valorReceitaBruTotal) {
			this.valorReceitaBruTotal = valorReceitaBruTotal;
		}
		public double getValorTotalCprb() {
			return valorTotalCprb;
		}
		public void setValorTotalCprb(double valorTotalCprb) {
			this.valorTotalCprb = valorTotalCprb;
		}
		public double getValorContriPrevExigiSusp() {
			return valorContriPrevExigiSusp;
		}
		public void setValorContriPrevExigiSusp(double valorContriPrevExigiSusp) {
			this.valorContriPrevExigiSusp = valorContriPrevExigiSusp;
		}
		public long getCodTipoProc() {
			return codTipoProc;
		}
		public void setCodTipoProc(long codTipoProc) {
			this.codTipoProc = codTipoProc;
		}
		public double getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(double codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public double getCodIndiComerc() {
			return codIndiComerc;
		}
		public void setCodIndiComerc(double codIndiComerc) {
			this.codIndiComerc = codIndiComerc;
		}
		public double getValorTotalReceita() {
			return valorTotalReceita;
		}
		public void setValorTotalReceita(double valorTotalReceita) {
			this.valorTotalReceita = valorTotalReceita;
		}
		public double getValorTotalExclusoes() {
			return valorTotalExclusoes;
		}
		public void setValorTotalExclusoes(double valorTotalExclusoes) {
			this.valorTotalExclusoes = valorTotalExclusoes;
		}
		public double getValorTotalAdicoes() {
			return valorTotalAdicoes;
		}
		public void setValorTotalAdicoes(double valorTotalAdicoes) {
			this.valorTotalAdicoes = valorTotalAdicoes;
		}
		public double getValorBaseCprb() {
			return valorBaseCprb;
		}
		public void setValorBaseCprb(double valorBaseCprb) {
			this.valorBaseCprb = valorBaseCprb;
		}
		public double getValorContribPrev() {
			return valorContribPrev;
		}
		public void setValorContribPrev(double valorContribPrev) {
			this.valorContribPrev = valorContribPrev;
		}
		public double getDataEmissaoNotaFisc() {
			return dataEmissaoNotaFisc;
		}
		public void setDataEmissaoNotaFisc(double dataEmissaoNotaFisc) {
			this.dataEmissaoNotaFisc = dataEmissaoNotaFisc;
		}
		public double getValorBrutoNotafisc() {
			return valorBrutoNotafisc;
		}
		public void setValorBrutoNotafisc(double valorBrutoNotafisc) {
			this.valorBrutoNotafisc = valorBrutoNotafisc;
		}
		public double getTipoAjuste() {
			return tipoAjuste;
		}
		public void setTipoAjuste(double tipoAjuste) {
			this.tipoAjuste = tipoAjuste;
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
		public long getSerialversionuid() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}
    }
}