package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "ReceitaEspetaculoDesp")
@ViewScoped

@Entity
public class ReceitaEspetaculoDesp implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
		private String codFilial;
		private String numBoletim;
		private double tipoCompeticao;
		private double categoriaEvento;
		private String modalidadeEventoDesp;
		private String entreOutras;
		private String cnpjClubeMandante;
		private String cnpjClubeVisitante;
		private String nomeClubeVisitante;
		private String pracaDespLocalEvento;
		private double codMunicipio;
		private String siglaUniFederacao;
		private double qtdEspecPagantesEvento;
		private double qtdEspecNaoPagantesEvento;
		private double tipoIngresso;
		private String descTipoIngresso;
		private double numIngressosColocVenda;
		private double numIngressosVendidos;
		private double numIngressosDevolvidos;
		private double precoIngresso;
		private double valorTotalArrecadado;
		private double tipoReceita;
		private double valorReceitaAuferida;
		private String descReceita;
		private double valorReceitaBruta;
		private double valorContribPrev;
		private double valorContribPrevExigiSusp;
		private double tipoProcesso;
		private String numProcAdm;
		private double codIndiSusp;
		private double valorTotalClubesParticipantes;
		private double valorRetido;
		private String codContaAnaliticaContabil;
		private String openFlex01;
		private String openFlex02;

		
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
		public String getNumBoletim() {
			return numBoletim;
		}
		public void setNumBoletim(String numBoletim) {
			this.numBoletim = numBoletim;
		}
		public double getTipoCompeticao() {
			return tipoCompeticao;
		}
		public void setTipoCompeticao(double tipoCompeticao) {
			this.tipoCompeticao = tipoCompeticao;
		}
		public double getCategoriaEvento() {
			return categoriaEvento;
		}
		public void setCategoriaEvento(double categoriaEvento) {
			this.categoriaEvento = categoriaEvento;
		}
		public String getModalidadeEventoDesp() {
			return modalidadeEventoDesp;
		}
		public void setModalidadeEventoDesp(String modalidadeEventoDesp) {
			this.modalidadeEventoDesp = modalidadeEventoDesp;
		}
		public String getEntreOutras() {
			return entreOutras;
		}
		public void setEntreOutras(String entreOutras) {
			this.entreOutras = entreOutras;
		}
		public String getCnpjClubeMandante() {
			return cnpjClubeMandante;
		}
		public void setCnpjClubeMandante(String cnpjClubeMandante) {
			this.cnpjClubeMandante = cnpjClubeMandante;
		}
		public String getCnpjClubeVisitante() {
			return cnpjClubeVisitante;
		}
		public void setCnpjClubeVisitante(String cnpjClubeVisitante) {
			this.cnpjClubeVisitante = cnpjClubeVisitante;
		}
		public String getNomeClubeVisitante() {
			return nomeClubeVisitante;
		}
		public void setNomeClubeVisitante(String nomeClubeVisitante) {
			this.nomeClubeVisitante = nomeClubeVisitante;
		}
		public String getPracaDespLocalEvento() {
			return pracaDespLocalEvento;
		}
		public void setPracaDespLocalEvento(String pracaDespLocalEvento) {
			this.pracaDespLocalEvento = pracaDespLocalEvento;
		}
		public double getCodMunicipio() {
			return codMunicipio;
		}
		public void setCodMunicipio(double codMunicipio) {
			this.codMunicipio = codMunicipio;
		}
		public String getSiglaUniFederacao() {
			return siglaUniFederacao;
		}
		public void setSiglaUniFederacao(String siglaUniFederacao) {
			this.siglaUniFederacao = siglaUniFederacao;
		}
		public double getQtdEspecPagantesEvento() {
			return qtdEspecPagantesEvento;
		}
		public void setQtdEspecPagantesEvento(double qtdEspecPagantesEvento) {
			this.qtdEspecPagantesEvento = qtdEspecPagantesEvento;
		}
		public double getQtdEspecNaoPagantesEvento() {
			return qtdEspecNaoPagantesEvento;
		}
		public void setQtdEspecNaoPagantesEvento(double qtdEspecNaoPagantesEvento) {
			this.qtdEspecNaoPagantesEvento = qtdEspecNaoPagantesEvento;
		}
		public double getTipoIngresso() {
			return tipoIngresso;
		}
		public void setTipoIngresso(double tipoIngresso) {
			this.tipoIngresso = tipoIngresso;
		}
		public String getDescTipoIngresso() {
			return descTipoIngresso;
		}
		public void setDescTipoIngresso(String descTipoIngresso) {
			this.descTipoIngresso = descTipoIngresso;
		}
		public double getNumIngressosColocVenda() {
			return numIngressosColocVenda;
		}
		public void setNumIngressosColocVenda(double numIngressosColocVenda) {
			this.numIngressosColocVenda = numIngressosColocVenda;
		}
		public double getNumIngressosVendidos() {
			return numIngressosVendidos;
		}
		public void setNumIngressosVendidos(double numIngressosVendidos) {
			this.numIngressosVendidos = numIngressosVendidos;
		}
		public double getNumIngressosDevolvidos() {
			return numIngressosDevolvidos;
		}
		public void setNumIngressosDevolvidos(double numIngressosDevolvidos) {
			this.numIngressosDevolvidos = numIngressosDevolvidos;
		}
		public double getPrecoIngresso() {
			return precoIngresso;
		}
		public void setPrecoIngresso(double precoIngresso) {
			this.precoIngresso = precoIngresso;
		}
		public double getValorTotalArrecadado() {
			return valorTotalArrecadado;
		}
		public void setValorTotalArrecadado(double valorTotalArrecadado) {
			this.valorTotalArrecadado = valorTotalArrecadado;
		}
		public double getTipoReceita() {
			return tipoReceita;
		}
		public void setTipoReceita(double tipoReceita) {
			this.tipoReceita = tipoReceita;
		}
		public double getValorReceitaAuferida() {
			return valorReceitaAuferida;
		}
		public void setValorReceitaAuferida(double valorReceitaAuferida) {
			this.valorReceitaAuferida = valorReceitaAuferida;
		}
		public String getDescReceita() {
			return descReceita;
		}
		public void setDescReceita(String descReceita) {
			this.descReceita = descReceita;
		}
		public double getValorReceitaBruta() {
			return valorReceitaBruta;
		}
		public void setValorReceitaBruta(double valorReceitaBruta) {
			this.valorReceitaBruta = valorReceitaBruta;
		}
		public double getValorContribPrev() {
			return valorContribPrev;
		}
		public void setValorContribPrev(double valorContribPrev) {
			this.valorContribPrev = valorContribPrev;
		}
		public double getValorContribPrevExigiSusp() {
			return valorContribPrevExigiSusp;
		}
		public void setValorContribPrevExigiSusp(double valorContribPrevExigiSusp) {
			this.valorContribPrevExigiSusp = valorContribPrevExigiSusp;
		}
		public double getTipoProcesso() {
			return tipoProcesso;
		}
		public void setTipoProcesso(double tipoProcesso) {
			this.tipoProcesso = tipoProcesso;
		}
		public String getNumProcAdm() {
			return numProcAdm;
		}
		public void setNumProcAdm(String numProcAdm) {
			this.numProcAdm = numProcAdm;
		}
		public double getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(double codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public double getValorTotalClubesParticipantes() {
			return valorTotalClubesParticipantes;
		}
		public void setValorTotalClubesParticipantes(double valorTotalClubesParticipantes) {
			this.valorTotalClubesParticipantes = valorTotalClubesParticipantes;
		}
		public double getValorRetido() {
			return valorRetido;
		}
		public void setValorRetido(double valorRetido) {
			this.valorRetido = valorRetido;
		}
		public String getCodContaAnaliticaContabil() {
			return codContaAnaliticaContabil;
		}
		public void setCodContaAnaliticaContabil(String codContaAnaliticaContabil) {
			this.codContaAnaliticaContabil = codContaAnaliticaContabil;
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

