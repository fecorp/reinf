package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "ComplementoAlimeEntrada")
@ViewScoped

@Entity
public class ComplementoAlimeEntrada implements Serializable, EntidadeBase {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
		private String codFilial;
		private String serieNotaFiscal;
		private String numNotaFiscal;
		private double dataEmissao;
		private String categoriaPfPj;
		private String retencaoCondEspeciais;
		private String codPfPj;
		private double codAtividadeEconomica;
		private double custoAlimeForncContratada;
		private double custoForncTransp;
		private double valorRetencaoServicos;
		private double adicionalSobreRetencao;
		private double contribuicao01;
		private double contribuicao02;
		private double contribuicao03;
		private String openFlex01;
		private String openFlex02;
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
		public String getNumNotaFiscal() {
			return numNotaFiscal;
		}
		public void setNumNotaFiscal(String numNotaFiscal) {
			this.numNotaFiscal = numNotaFiscal;
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
		public String getCodPfPj() {
			return codPfPj;
		}
		public void setCodPfPj(String codPfPj) {
			this.codPfPj = codPfPj;
		}
		public double getCodAtividadeEconomica() {
			return codAtividadeEconomica;
		}
		public void setCodAtividadeEconomica(double codAtividadeEconomica) {
			this.codAtividadeEconomica = codAtividadeEconomica;
		}
		public double getCustoAlimeForncContratada() {
			return custoAlimeForncContratada;
		}
		public void setCustoAlimeForncContratada(double custoAlimeForncContratada) {
			this.custoAlimeForncContratada = custoAlimeForncContratada;
		}
		public double getCustoForncTransp() {
			return custoForncTransp;
		}
		public void setCustoForncTransp(double custoForncTransp) {
			this.custoForncTransp = custoForncTransp;
		}
		public double getValorRetencaoServicos() {
			return valorRetencaoServicos;
		}
		public void setValorRetencaoServicos(double valorRetencaoServicos) {
			this.valorRetencaoServicos = valorRetencaoServicos;
		}
		public double getAdicionalSobreRetencao() {
			return adicionalSobreRetencao;
		}
		public void setAdicionalSobreRetencao(double adicionalSobreRetencao) {
			this.adicionalSobreRetencao = adicionalSobreRetencao;
		}
		public double getContribuicao01() {
			return contribuicao01;
		}
		public void setContribuicao01(double contribuicao01) {
			this.contribuicao01 = contribuicao01;
		}
		public double getContribuicao02() {
			return contribuicao02;
		}
		public void setContribuicao02(double contribuicao02) {
			this.contribuicao02 = contribuicao02;
		}
		public double getContribuicao03() {
			return contribuicao03;
		}
		public void setContribuicao03(double contribuicao03) {
			this.contribuicao03 = contribuicao03;
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
		public String getRetencaoCondEspeciais() {
			return retencaoCondEspeciais;
		}
		public void setRetencaoCondEspeciais(String retencaoCondEspeciais) {
			this.retencaoCondEspeciais = retencaoCondEspeciais;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}

