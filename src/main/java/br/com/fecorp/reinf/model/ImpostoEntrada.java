package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "ImpostoEntrada")
@ViewScoped

@Entity
public class ImpostoEntrada implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String codEmpresa;
	    private String codFilial;
	    private String serieNotaFiscal;
	    private String numNotaFiscal;
	    private double dataEmissao;
	    private String categoriaPfPj;
	    private String codigoPfPj;
	    private String sequenciaItens;
	    private double valorServico;
	    private double valorMaterialApp;
	    private double valorDesconto;
	    private double valorTotalDocumento;
	    private double valorBaseIrrf;
	    private String codRetencaoIrrfDirf;
	    private double aliquotaIrrf;
	    private double valorIrrf;
	    private double baseCalculoRetInss;
	    private double aliquotaInss;
	    private double valorRetancaoInss;
	    private double valorBaseCalcIss;
	    private double aliquotaIss;
	    private double valorIss;
	    private double valorIssRetido;
	    private String textoComplementar;
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
		public double getValorServico() {
			return valorServico;
		}
		public void setValorServico(double valorServico) {
			this.valorServico = valorServico;
		}
		public double getValorMaterialApp() {
			return valorMaterialApp;
		}
		public void setValorMaterialApp(double valorMaterialApp) {
			this.valorMaterialApp = valorMaterialApp;
		}
		public double getValorDesconto() {
			return valorDesconto;
		}
		public void setValorDesconto(double valorDesconto) {
			this.valorDesconto = valorDesconto;
		}
		public double getValorTotalDocumento() {
			return valorTotalDocumento;
		}
		public void setValorTotalDocumento(double valorTotalDocumento) {
			this.valorTotalDocumento = valorTotalDocumento;
		}
		public double getValorBaseIrrf() {
			return valorBaseIrrf;
		}
		public void setValorBaseIrrf(double valorBaseIrrf) {
			this.valorBaseIrrf = valorBaseIrrf;
		}
		public String getCodRetencaoIrrfDirf() {
			return codRetencaoIrrfDirf;
		}
		public void setCodRetencaoIrrfDirf(String codRetencaoIrrfDirf) {
			this.codRetencaoIrrfDirf = codRetencaoIrrfDirf;
		}
		public double getAliquotaIrrf() {
			return aliquotaIrrf;
		}
		public void setAliquotaIrrf(double aliquotaIrrf) {
			this.aliquotaIrrf = aliquotaIrrf;
		}
		public double getValorIrrf() {
			return valorIrrf;
		}
		public void setValorIrrf(double valorIrrf) {
			this.valorIrrf = valorIrrf;
		}
		public double getBaseCalculoRetInss() {
			return baseCalculoRetInss;
		}
		public void setBaseCalculoRetInss(double baseCalculoRetInss) {
			this.baseCalculoRetInss = baseCalculoRetInss;
		}
		public double getAliquotaInss() {
			return aliquotaInss;
		}
		public void setAliquotaInss(double aliquotaInss) {
			this.aliquotaInss = aliquotaInss;
		}
		public double getValorRetancaoInss() {
			return valorRetancaoInss;
		}
		public void setValorRetancaoInss(double valorRetancaoInss) {
			this.valorRetancaoInss = valorRetancaoInss;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Serializable getId() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	    

	}	

