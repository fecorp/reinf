package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@ManagedBean(name = "ComplementoTotalizadorEntrada")
@ViewScoped

@Entity
public class ComplementoTotalizadorEntrada implements Serializable{
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
		private String codFilial;
		private String serieNotaFiscal;
		
		@Temporal(TemporalType.DATE)
		private Date dataEmissao;
		private String categoriaPfPj;
		private String codigoPfPj;
		private String sequenciaItens;
		private BigDecimal valorTotalDoc;
		private BigDecimal valorServicos;
		private BigDecimal valorMaterialApply;
		private BigDecimal valorDesconto;
		private BigDecimal somaRetencoes;
		private BigDecimal somaAdicional;
		private BigDecimal valorRetencaoPrincipal;
		private BigDecimal valorRetencaoAdicional;
		private String openFlex01;
		private String openFlex02;
		private double numNotaFiscal;

		
		
		
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
		public String getSerieNotaFiscal() {
			return serieNotaFiscal;
		}
		public void setSerieNotaFiscal(String serieNotaFiscal) {
			this.serieNotaFiscal = serieNotaFiscal;
		}
		public Date getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(Date dataEmissao) {
			this.dataEmissao = dataEmissao;
		}
		public String getCategoriaPfPj() {
			return categoriaPfPj;
		}
		public void setCategoriaPfPj(String categoriaPfPj) {
			this.categoriaPfPj = categoriaPfPj;
		}
		public String getCodigoPfPj() {
			return codigoPfPj;
		}
		public void setCodigoPfPj(String codigoPfPj) {
			this.codigoPfPj = codigoPfPj;
		}
		public String getSequenciaItens() {
			return sequenciaItens;
		}
		public void setSequenciaItens(String sequenciaItens) {
			this.sequenciaItens = sequenciaItens;
		}
		public BigDecimal getValorTotalDoc() {
			return valorTotalDoc;
		}
		public void setValorTotalDoc(BigDecimal valorTotalDoc) {
			this.valorTotalDoc = valorTotalDoc;
		}
		public BigDecimal getValorServicos() {
			return valorServicos;
		}
		public void setValorServicos(BigDecimal valorServicos) {
			this.valorServicos = valorServicos;
		}
		public BigDecimal getValorMaterialApply() {
			return valorMaterialApply;
		}
		public void setValorMaterialApply(BigDecimal valorMaterialApply) {
			this.valorMaterialApply = valorMaterialApply;
		}
		public BigDecimal getValorDesconto() {
			return valorDesconto;
		}
		public void setValorDesconto(BigDecimal valorDesconto) {
			this.valorDesconto = valorDesconto;
		}
		public BigDecimal getSomaRetencoes() {
			return somaRetencoes;
		}
		public void setSomaRetencoes(BigDecimal somaRetencoes) {
			this.somaRetencoes = somaRetencoes;
		}
		public BigDecimal getSomaAdicional() {
			return somaAdicional;
		}
		public void setSomaAdicional(BigDecimal somaAdicional) {
			this.somaAdicional = somaAdicional;
		}
		public BigDecimal getValorRetencaoPrincipal() {
			return valorRetencaoPrincipal;
		}
		public void setValorRetencaoPrincipal(BigDecimal valorRetencaoPrincipal) {
			this.valorRetencaoPrincipal = valorRetencaoPrincipal;
		}
		public BigDecimal getValorRetencaoAdicional() {
			return valorRetencaoAdicional;
		}
		public void setValorRetencaoAdicional(BigDecimal valorRetencaoAdicional) {
			this.valorRetencaoAdicional = valorRetencaoAdicional;
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
		public double getNumNotaFiscal() {
			return numNotaFiscal;
		}
		public void setNumNotaFiscal(double numNotaFiscal) {
			this.numNotaFiscal = numNotaFiscal;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public static long getSiderialversionu() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}


	}	

