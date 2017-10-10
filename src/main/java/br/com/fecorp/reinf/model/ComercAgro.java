package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

public class ComercAgro {
	
	@Entity
	public class comercAgro implements Serializable, EntidadeBase {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ComercAgro")

		
		private String codEmpresa;
		private String codFilial;
		private String numInscricaoEstab;
		private String codContaAnaCont;
		private String numSerieNF;
		private String numNotaFiscalFat;
		private String numProcAdm;
		private String openFlex01;
		private String openFlex02;
		private long codTipoInscricao;
		private double valorReceitaBruTot;
		private double valorContribPrev;
		private double valorContribPrevGil;
		private double valorContribSenar;
		private long indiComerc;
		private double valorTotalComerc;
		private double dataEmiNotaFis;
		public double valorBrutoNotaFis;
		private long codTipoProcesso;
		private double codIndiSusp;
		private double valorContribPrevExibSusp;
		private double valorContribGilExibSusp;
		private double valorContribSenarExibSusp;
		
		
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
		public String getNumInscricaoEstab() {
			return numInscricaoEstab;
		}
		public void setNumInscricaoEstab(String numInscricaoEstab) {
			this.numInscricaoEstab = numInscricaoEstab;
		}
		public String getCodContaAnaCont() {
			return codContaAnaCont;
		}
		public void setCodContaAnaCont(String codContaAnaCont) {
			this.codContaAnaCont = codContaAnaCont;
		}
		public String getNumSerieNF() {
			return numSerieNF;
		}
		public void setNumSerieNF(String numSerieNF) {
			this.numSerieNF = numSerieNF;
		}
		public String getNumNotaFiscalFat() {
			return numNotaFiscalFat;
		}
		public void setNumNotaFiscalFat(String numNotaFiscalFat) {
			this.numNotaFiscalFat = numNotaFiscalFat;
		}
		public String getNumProcAdm() {
			return numProcAdm;
		}
		public void setNumProcAdm(String numProcAdm) {
			this.numProcAdm = numProcAdm;
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
		public long getCodTipoInscricao() {
			return codTipoInscricao;
		}
		public void setCodTipoInscricao(long codTipoInscricao) {
			this.codTipoInscricao = codTipoInscricao;
		}
		public double getValorReceitaBruTot() {
			return valorReceitaBruTot;
		}
		public void setValorReceitaBruTot(double valorReceitaBruTot) {
			this.valorReceitaBruTot = valorReceitaBruTot;
		}
		public double getValorContribPrev() {
			return valorContribPrev;
		}
		public void setValorContribPrev(double valorContribPrev) {
			this.valorContribPrev = valorContribPrev;
		}
		public double getValorContribPrevGil() {
			return valorContribPrevGil;
		}
		public void setValorContribPrevGil(double valorContribPrevGil) {
			this.valorContribPrevGil = valorContribPrevGil;
		}
		public double getValorContribSenar() {
			return valorContribSenar;
		}
		public void setValorContribSenar(double valorContribSenar) {
			this.valorContribSenar = valorContribSenar;
		}
		public long getIndiComerc() {
			return indiComerc;
		}
		public void setIndiComerc(long indiComerc) {
			this.indiComerc = indiComerc;
		}
		public double getValorTotalComerc() {
			return valorTotalComerc;
		}
		public void setValorTotalComerc(double valorTotalComerc) {
			this.valorTotalComerc = valorTotalComerc;
		}
		public double getDataEmiNotaFis() {
			return dataEmiNotaFis;
		}
		public void setDataEmiNotaFis(double dataEmiNotaFis) {
			this.dataEmiNotaFis = dataEmiNotaFis;
		}
		public double getValorBrutoNotaFis() {
			return valorBrutoNotaFis;
		}
		public void setValorBrutoNotaFis(double valorBrutoNotaFis) {
			this.valorBrutoNotaFis = valorBrutoNotaFis;
		}
		public long getCodTipoProcesso() {
			return codTipoProcesso;
		}
		public void setCodTipoProcesso(long codTipoProcesso) {
			this.codTipoProcesso = codTipoProcesso;
		}
		public double getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(double codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public double getValorContribPrevExibSusp() {
			return valorContribPrevExibSusp;
		}
		public void setValorContribPrevExibSusp(double valorContribPrevExibSusp) {
			this.valorContribPrevExibSusp = valorContribPrevExibSusp;
		}
		public double getValorContribGilExibSusp() {
			return valorContribGilExibSusp;
		}
		public void setValorContribGilExibSusp(double valorContribGilExibSusp) {
			this.valorContribGilExibSusp = valorContribGilExibSusp;
		}
		public double getValorContribSenarExibSusp() {
			return valorContribSenarExibSusp;
		}
		public void setValorContribSenarExibSusp(double valorContribSenarExibSusp) {
			this.valorContribSenarExibSusp = valorContribSenarExibSusp;
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
