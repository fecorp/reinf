package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
		
		private BigDecimal valorIrrf;
	    private String codEmpresa;
		private BigDecimal baseCalculoRetencaoInss;
		private BigDecimal aliquotaInss;
		private String codFilial;
		private String serieNotaFiscal;
		private String catPfPj;
		private String codPfPj;
		private String sequenciaItens;
		private BigDecimal numNotaFiscal;
		private BigDecimal valorRetencaoInss;
		private BigDecimal valorBaseCalcIss;
		private BigDecimal aliquotaIss;
		private BigDecimal valorIss;
		private BigDecimal valorIssRetido;
		private String textoComplementar;
		private String openFlex01;
		private String openFlex02;
		

		public BigDecimal getValorIrrf() {
			return valorIrrf;
		}
		public void setValorIrrf(BigDecimal valorIrrf) {
			this.valorIrrf = valorIrrf;
		}
		public String getCodEmpresa() {
			return codEmpresa;
		}
		public void setCodEmpresa(String codEmpresa) {
			this.codEmpresa = codEmpresa;
		}
		public BigDecimal getBaseCalculoRetencaoInss() {
			return baseCalculoRetencaoInss;
		}
		public void setBaseCalculoRetencaoInss(BigDecimal baseCalculoRetencaoInss) {
			this.baseCalculoRetencaoInss = baseCalculoRetencaoInss;
		}
		public BigDecimal getAliquotaInss() {
			return aliquotaInss;
		}
		public void setAliquotaInss(BigDecimal aliquotaInss) {
			this.aliquotaInss = aliquotaInss;
		}
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
		public BigDecimal getNumNotaFiscal() {
			return numNotaFiscal;
		}
		public void setNumNotaFiscal(BigDecimal numNotaFiscal) {
			this.numNotaFiscal = numNotaFiscal;
		}
		public BigDecimal getValorRetencaoInss() {
			return valorRetencaoInss;
		}
		public void setValorRetencaoInss(BigDecimal valorRetencaoInss) {
			this.valorRetencaoInss = valorRetencaoInss;
		}
		public BigDecimal getValorBaseCalcIss() {
			return valorBaseCalcIss;
		}
		public void setValorBaseCalcIss(BigDecimal valorBaseCalcIss) {
			this.valorBaseCalcIss = valorBaseCalcIss;
		}
		public BigDecimal getAliquotaIss() {
			return aliquotaIss;
		}
		public void setAliquotaIss(BigDecimal aliquotaIss) {
			this.aliquotaIss = aliquotaIss;
		}
		public BigDecimal getValorIss() {
			return valorIss;
		}
		public void setValorIss(BigDecimal valorIss) {
			this.valorIss = valorIss;
		}
		public BigDecimal getValorIssRetido() {
			return valorIssRetido;
		}
		public void setValorIssRetido(BigDecimal valorIssRetido) {
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

