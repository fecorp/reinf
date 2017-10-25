package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "ImpostoSaida")
@ViewScoped

@Entity
public class ImpostoSaida implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
		private double valorIrrf;
	    private String codEmpresa;
		private double baseCalculoRetencaoInss;
		private double aliquotaInss;
		private String codFilial;
		private String serieNotaFiscal;
		private String catPfPj;
		private String codPfPj;
		private String sequenciaItens;
		private double numNotaFiscal;
		private double valorRetencaoInss;
		private double valorBaseCalcIss;
		private double aliquotaIss;
		private double valorIss;
		private double valorIssRetido;
		private String textoComplementar;
		private String openFlex01;
		private String openFlex02;
		
		
		public String getCodFilial() {
			return codFilial;
		}
		public void setCodFilial(String codFilial) {
			this.codFilial = codFilial;
		}
		public String getSerieNotaFiscal() {
			return serieNotaFiscal;
		}
		public void setSerieNotaFiscal(String serieNotaFiscal) {
			this.serieNotaFiscal = serieNotaFiscal;
		}
		public String getCatPfPj() {
			return catPfPj;
		}
		public void setCatPfPj(String catPfPj) {
			this.catPfPj = catPfPj;
		}
		public String getCodPfPj() {
			return codPfPj;
		}
		public void setCodPfPj(String codPfPj) {
			this.codPfPj = codPfPj;
		}
		public String getSequenciaItens() {
			return sequenciaItens;
		}
		public void setSequenciaItens(String sequenciaItens) {
			this.sequenciaItens = sequenciaItens;
		}
		public double getNumNotaFiscal() {
			return numNotaFiscal;
		}
		public void setNumNotaFiscal(double numNotaFiscal) {
			this.numNotaFiscal = numNotaFiscal;
		}
		public String getCodEmpresa() {
			return codEmpresa;
		}
		public void setCodEmpresa(String codEmpresa) {
			this.codEmpresa = codEmpresa;
		}
		public double getValorIrrf() {
			return valorIrrf;
		}
		public void setValorIrrf(double valorIrrf) {
			this.valorIrrf = valorIrrf;
		}
		public double getBaseCalculoRetencaoInss() {
			return baseCalculoRetencaoInss;
		}
		public void setBaseCalculoRetencaoInss(double baseCalculoRetencaoInss) {
			this.baseCalculoRetencaoInss = baseCalculoRetencaoInss;
		}
		public double getAliquotaInss() {
			return aliquotaInss;
		}
		public void setAliquotaInss(double aliquotaInss) {
			this.aliquotaInss = aliquotaInss;
		}
		public double getValorRetencaoInss() {
			return valorRetencaoInss;
		}
		public void setValorRetencaoInss(double valorRetencaoInss) {
			this.valorRetencaoInss = valorRetencaoInss;
		}
		public double getValorBaseCalcIss() {
			return valorBaseCalcIss;
		}
		public void setValorBaseCalcIss(double valorBaseCalcIss) {
			this.valorBaseCalcIss = valorBaseCalcIss;
		}
		public double getAliquotaIss() {
			return aliquotaIss;
		}
		public void setAliquotaIss(double aliquotaIss) {
			this.aliquotaIss = aliquotaIss;
		}
		public double getValorIss() {
			return valorIss;
		}
		public void setValorIss(double valorIss) {
			this.valorIss = valorIss;
		}
		public double getValorIssRetido() {
			return valorIssRetido;
		}
		public void setValorIssRetido(double valorIssRetido) {
			this.valorIssRetido = valorIssRetido;
		}
		public String getTextoComplementar() {
			return textoComplementar;
		}
		public void setTextoComplementar(String textoComplementar) {
			this.textoComplementar = textoComplementar;
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

