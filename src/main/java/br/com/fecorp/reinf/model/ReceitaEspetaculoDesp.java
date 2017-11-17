package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
		private BigDecimal tipoCompeticao;
		private BigDecimal categoriaEvento;
		private String modalidadeEventoDesp;
		private String entreOutras;
		private String cnpjClubeMandante;
		private String cnpjClubeVisitante;
		private String nomeClubeVisitante;
		private String pracaDespLocalEvento;
		private BigDecimal codMunicipio;
		private String siglaUniFederacao;
		private BigDecimal qtdEspecPagantesEvento;
		private BigDecimal qtdEspecNaoPagantesEvento;
		private BigDecimal tipoIngresso;
		private String descTipoIngresso;
		private BigDecimal numIngressosColocVenda;
		private BigDecimal numIngressosVendidos;
		private BigDecimal numIngressosDevolvidos;
		private BigDecimal precoIngresso;
		private BigDecimal valorTotalArrecadado;
		private BigDecimal tipoReceita;
		private BigDecimal valorReceitaAuferida;
		private String descReceita;
		private BigDecimal valorReceitaBruta;
		private BigDecimal valorContribPrev;
		private BigDecimal valorContribPrevExigiSusp;
		private BigDecimal tipoProcesso;
		private String numProcAdm;
		private BigDecimal codIndiSusp;
		private BigDecimal valorTotalClubesParticipantes;
		private BigDecimal valorRetido;
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
		public BigDecimal getTipoCompeticao() {
			return tipoCompeticao;
		}
		public void setTipoCompeticao(BigDecimal tipoCompeticao) {
			this.tipoCompeticao = tipoCompeticao;
		}
		public BigDecimal getCategoriaEvento() {
			return categoriaEvento;
		}
		public void setCategoriaEvento(BigDecimal categoriaEvento) {
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
		public BigDecimal getCodMunicipio() {
			return codMunicipio;
		}
		public void setCodMunicipio(BigDecimal codMunicipio) {
			this.codMunicipio = codMunicipio;
		}
		public String getSiglaUniFederacao() {
			return siglaUniFederacao;
		}
		public void setSiglaUniFederacao(String siglaUniFederacao) {
			this.siglaUniFederacao = siglaUniFederacao;
		}
		public BigDecimal getQtdEspecPagantesEvento() {
			return qtdEspecPagantesEvento;
		}
		public void setQtdEspecPagantesEvento(BigDecimal qtdEspecPagantesEvento) {
			this.qtdEspecPagantesEvento = qtdEspecPagantesEvento;
		}
		public BigDecimal getQtdEspecNaoPagantesEvento() {
			return qtdEspecNaoPagantesEvento;
		}
		public void setQtdEspecNaoPagantesEvento(BigDecimal qtdEspecNaoPagantesEvento) {
			this.qtdEspecNaoPagantesEvento = qtdEspecNaoPagantesEvento;
		}
		public BigDecimal getTipoIngresso() {
			return tipoIngresso;
		}
		public void setTipoIngresso(BigDecimal tipoIngresso) {
			this.tipoIngresso = tipoIngresso;
		}
		public String getDescTipoIngresso() {
			return descTipoIngresso;
		}
		public void setDescTipoIngresso(String descTipoIngresso) {
			this.descTipoIngresso = descTipoIngresso;
		}
		public BigDecimal getNumIngressosColocVenda() {
			return numIngressosColocVenda;
		}
		public void setNumIngressosColocVenda(BigDecimal numIngressosColocVenda) {
			this.numIngressosColocVenda = numIngressosColocVenda;
		}
		public BigDecimal getNumIngressosVendidos() {
			return numIngressosVendidos;
		}
		public void setNumIngressosVendidos(BigDecimal numIngressosVendidos) {
			this.numIngressosVendidos = numIngressosVendidos;
		}
		public BigDecimal getNumIngressosDevolvidos() {
			return numIngressosDevolvidos;
		}
		public void setNumIngressosDevolvidos(BigDecimal numIngressosDevolvidos) {
			this.numIngressosDevolvidos = numIngressosDevolvidos;
		}
		public BigDecimal getPrecoIngresso() {
			return precoIngresso;
		}
		public void setPrecoIngresso(BigDecimal precoIngresso) {
			this.precoIngresso = precoIngresso;
		}
		public BigDecimal getValorTotalArrecadado() {
			return valorTotalArrecadado;
		}
		public void setValorTotalArrecadado(BigDecimal valorTotalArrecadado) {
			this.valorTotalArrecadado = valorTotalArrecadado;
		}
		public BigDecimal getTipoReceita() {
			return tipoReceita;
		}
		public void setTipoReceita(BigDecimal tipoReceita) {
			this.tipoReceita = tipoReceita;
		}
		public BigDecimal getValorReceitaAuferida() {
			return valorReceitaAuferida;
		}
		public void setValorReceitaAuferida(BigDecimal valorReceitaAuferida) {
			this.valorReceitaAuferida = valorReceitaAuferida;
		}
		public String getDescReceita() {
			return descReceita;
		}
		public void setDescReceita(String descReceita) {
			this.descReceita = descReceita;
		}
		public BigDecimal getValorReceitaBruta() {
			return valorReceitaBruta;
		}
		public void setValorReceitaBruta(BigDecimal valorReceitaBruta) {
			this.valorReceitaBruta = valorReceitaBruta;
		}
		public BigDecimal getValorContribPrev() {
			return valorContribPrev;
		}
		public void setValorContribPrev(BigDecimal valorContribPrev) {
			this.valorContribPrev = valorContribPrev;
		}
		public BigDecimal getValorContribPrevExigiSusp() {
			return valorContribPrevExigiSusp;
		}
		public void setValorContribPrevExigiSusp(BigDecimal valorContribPrevExigiSusp) {
			this.valorContribPrevExigiSusp = valorContribPrevExigiSusp;
		}
		public BigDecimal getTipoProcesso() {
			return tipoProcesso;
		}
		public void setTipoProcesso(BigDecimal tipoProcesso) {
			this.tipoProcesso = tipoProcesso;
		}
		public String getNumProcAdm() {
			return numProcAdm;
		}
		public void setNumProcAdm(String numProcAdm) {
			this.numProcAdm = numProcAdm;
		}
		public BigDecimal getCodIndiSusp() {
			return codIndiSusp;
		}
		public void setCodIndiSusp(BigDecimal codIndiSusp) {
			this.codIndiSusp = codIndiSusp;
		}
		public BigDecimal getValorTotalClubesParticipantes() {
			return valorTotalClubesParticipantes;
		}
		public void setValorTotalClubesParticipantes(BigDecimal valorTotalClubesParticipantes) {
			this.valorTotalClubesParticipantes = valorTotalClubesParticipantes;
		}
		public BigDecimal getValorRetido() {
			return valorRetido;
		}
		public void setValorRetido(BigDecimal valorRetido) {
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

