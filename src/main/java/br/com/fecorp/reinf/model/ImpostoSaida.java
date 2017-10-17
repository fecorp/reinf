package br.com.fecorp.reinf.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

	@Entity
	public class ImpostoSaida implements Serializable{
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
		private double valorIrrf;
		private double baseCalculoRetencaoInss;
		private double aliquotaInss;
		private double valorRetencaoInss;
		private double valorBaseCalcIss;
		private double aliquotaIss;
		private double valorIss;
		private double valorIssRetido;
		private String textoComplementar;
		private String openFlex01;
		private String openFlex02;
		
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

