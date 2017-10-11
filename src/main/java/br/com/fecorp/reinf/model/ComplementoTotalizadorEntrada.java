package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

public class ComplementoTotalizadorEntrada {

	@Entity
	public class ComplementoTotalizadorEntrada_ implements Serializable, EntidadeBase {
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
		public long getSiderialversionu() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}


	}	
}
