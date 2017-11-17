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

@ManagedBean(name = "MestreEntrada")
@ViewScoped

@Entity
public class MestreEntrada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
		private String codEmpresa;
		private String codFilial;
		private String serieNotaFiscal;
		private String numNotaFiscal;
		private Date dataEmissao;
		private String catPfPj;
		private String codPfPj;
		private String qtdItens;
		private Date dataEntrada;
		private Date dataExecucao;
		private String tipoDocumento;
		private String codServico;
		private String descServico;
		private BigDecimal valorServico;
		private BigDecimal valorMaterialApply;
		private BigDecimal valorDesconto;
		private BigDecimal valorTotalDocumento;
		private BigDecimal valorTotalIss;
		private BigDecimal valorTotalIrrf;
		private BigDecimal valorTotalPcc;
		private BigDecimal valorTotalInss;
		private String numContratoServicos;
		private String codFiscalServicos;
		private String codFiscalDeServicos;
		private BigDecimal valorSubempreitada;
		private String tipoLocalidade;
		private String localidade;
		private String tipoDocMunicipio;
		private String contaContabil;
		private String centroCustos;
		private String chaveNfs;
		private String indicadorTipoPagamento;
		private String tipoServicoReinf;
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
		public Date getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(Date dataEmissao) {
			this.dataEmissao = dataEmissao;
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
		public String getQtdItens() {
			return qtdItens;
		}
		public void setQtdItens(String qtdItens) {
			this.qtdItens = qtdItens;
		}
		public Date getDataEntrada() {
			return dataEntrada;
		}
		public void setDataEntrada(Date dataEntrada) {
			this.dataEntrada = dataEntrada;
		}
		public Date getDataExecucao() {
			return dataExecucao;
		}
		public void setDataExecucao(Date dataExecucao) {
			this.dataExecucao = dataExecucao;
		}
		public String getTipoDocumento() {
			return tipoDocumento;
		}
		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}
		public String getCodServico() {
			return codServico;
		}
		public void setCodServico(String codServico) {
			this.codServico = codServico;
		}
		public String getDescServico() {
			return descServico;
		}
		public void setDescServico(String descServico) {
			this.descServico = descServico;
		}
		public BigDecimal getValorServico() {
			return valorServico;
		}
		public void setValorServico(BigDecimal valorServico) {
			this.valorServico = valorServico;
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
		public BigDecimal getValorTotalDocumento() {
			return valorTotalDocumento;
		}
		public void setValorTotalDocumento(BigDecimal valorTotalDocumento) {
			this.valorTotalDocumento = valorTotalDocumento;
		}
		public BigDecimal getValorTotalIss() {
			return valorTotalIss;
		}
		public void setValorTotalIss(BigDecimal valorTotalIss) {
			this.valorTotalIss = valorTotalIss;
		}
		public BigDecimal getValorTotalIrrf() {
			return valorTotalIrrf;
		}
		public void setValorTotalIrrf(BigDecimal valorTotalIrrf) {
			this.valorTotalIrrf = valorTotalIrrf;
		}
		public BigDecimal getValorTotalPcc() {
			return valorTotalPcc;
		}
		public void setValorTotalPcc(BigDecimal valorTotalPcc) {
			this.valorTotalPcc = valorTotalPcc;
		}
		public BigDecimal getValorTotalInss() {
			return valorTotalInss;
		}
		public void setValorTotalInss(BigDecimal valorTotalInss) {
			this.valorTotalInss = valorTotalInss;
		}
		public String getNumContratoServicos() {
			return numContratoServicos;
		}
		public void setNumContratoServicos(String numContratoServicos) {
			this.numContratoServicos = numContratoServicos;
		}
		public String getCodFiscalServicos() {
			return codFiscalServicos;
		}
		public void setCodFiscalServicos(String codFiscalServicos) {
			this.codFiscalServicos = codFiscalServicos;
		}
		public String getCodFiscalDeServicos() {
			return codFiscalDeServicos;
		}
		public void setCodFiscalDeServicos(String codFiscalDeServicos) {
			this.codFiscalDeServicos = codFiscalDeServicos;
		}
		public BigDecimal getValorSubempreitada() {
			return valorSubempreitada;
		}
		public void setValorSubempreitada(BigDecimal valorSubempreitada) {
			this.valorSubempreitada = valorSubempreitada;
		}
		public String getTipoLocalidade() {
			return tipoLocalidade;
		}
		public void setTipoLocalidade(String tipoLocalidade) {
			this.tipoLocalidade = tipoLocalidade;
		}
		public String getLocalidade() {
			return localidade;
		}
		public void setLocalidade(String localidade) {
			this.localidade = localidade;
		}
		public String getTipoDocMunicipio() {
			return tipoDocMunicipio;
		}
		public void setTipoDocMunicipio(String tipoDocMunicipio) {
			this.tipoDocMunicipio = tipoDocMunicipio;
		}
		public String getContaContabil() {
			return contaContabil;
		}
		public void setContaContabil(String contaContabil) {
			this.contaContabil = contaContabil;
		}
		public String getCentroCustos() {
			return centroCustos;
		}
		public void setCentroCustos(String centroCustos) {
			this.centroCustos = centroCustos;
		}
		public String getChaveNfs() {
			return chaveNfs;
		}
		public void setChaveNfs(String chaveNfs) {
			this.chaveNfs = chaveNfs;
		}
		public String getIndicadorTipoPagamento() {
			return indicadorTipoPagamento;
		}
		public void setIndicadorTipoPagamento(String indicadorTipoPagamento) {
			this.indicadorTipoPagamento = indicadorTipoPagamento;
		}
		public String getTipoServicoReinf() {
			return tipoServicoReinf;
		}
		public void setTipoServicoReinf(String tipoServicoReinf) {
			this.tipoServicoReinf = tipoServicoReinf;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}
	}	

