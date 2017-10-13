package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "ComplementoTotalizadorEntrada")
@ViewScoped

@Entity
public class ComplementoTotalizadorEntrada implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ComplementoTotalizadorEntrada")

		private String codEmpresa;
		private String codFilial;
		private String serieNotaFiscal;
		private double dataEmissao;
		private String categoriaPfPj;
		private String codigoPfPj;
		private String sequenciaItens;
		private double valorTotalDoc;
		private double valorServicos;
		private double valorMaterialApply;
		private double valorDesconto;
		private double somaRetencoes;
		private double somaAdicional;
		private double valorRetencaoPrincipal;
		private double valorRetencaoAdicional;
		private String openFlex01;
		private String openFlex02;
		private double numNotaFiscal;

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
		public double getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(double dataEmissao) {
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
		public double getValorTotalDoc() {
			return valorTotalDoc;
		}
		public void setValorTotalDoc(double valorTotalDoc) {
			this.valorTotalDoc = valorTotalDoc;
		}
		public double getValorServicos() {
			return valorServicos;
		}
		public void setValorServicos(double valorServicos) {
			this.valorServicos = valorServicos;
		}
		public double getValorMaterialApply() {
			return valorMaterialApply;
		}
		public void setValorMaterialApply(double valorMaterialApply) {
			this.valorMaterialApply = valorMaterialApply;
		}
		public double getValorDesconto() {
			return valorDesconto;
		}
		public void setValorDesconto(double valorDesconto) {
			this.valorDesconto = valorDesconto;
		}
		public double getSomaRetencoes() {
			return somaRetencoes;
		}
		public void setSomaRetencoes(double somaRetencoes) {
			this.somaRetencoes = somaRetencoes;
		}
		public double getSomaAdicional() {
			return somaAdicional;
		}
		public void setSomaAdicional(double somaAdicional) {
			this.somaAdicional = somaAdicional;
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
		public static long getSiderialversionu() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}


	}	

