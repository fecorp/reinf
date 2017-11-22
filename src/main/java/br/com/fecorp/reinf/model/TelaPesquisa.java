package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "TelaPesquisa")
@ViewScoped

@Entity
public class TelaPesquisa implements Serializable{
		
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
    // atributos do check-list item
	private String empresa;
	private String filial;
	private String categoriaPfPj;
	private String codPfPj;
	private double serieNotaFiscal;
	private double numNotaFiscal;
	private Date dataEmissao;
	private String sequenciaItens;
	private double valorServico;
	private double valorMaterialAplicado;
	private double valorDesconto;
	private double valorDocumento;
	private double valorIssDevido;
	private String irrfBase;
	private String irrfAliquota;
	private String irrfValoresRetidos;
	private String irrfCodRetencao;
	private String inssbase;
	private String inssAliquota;
	private String inssValoresRetidos;
	private String inssCodRetencao;
	private String pisBase;
	private String pisAliquota;
	private String pisValoresRetidos;
	private String pisCodRetencao;
	private String cofinsBase;
	private String cofinsAliquota;
	private String cofinsValoresRetidos;
	private String cofinsCodRetencao;
	private String sslBase;
	private String sslAliquota;
	private String sslValoresRetidos;
	private String sslCodRetencao;
	private String issBase;
	private String issAliquota;
	private String issValoresRetidos;
	private String issCodRetencao;
	private String openFlex01;
	private String openFlex02;
	
	// atributos do check-list criterio
	private String igual;
	private String maior;
	private String menor;
	private String contem;
	private String comecaCom;
	
	
	public TelaPesquisa() {}
	
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
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
	public double getSerieNotaFiscal() {
		return serieNotaFiscal;
	}
	public void setSerieNotaFiscal(double serieNotaFiscal) {
		this.serieNotaFiscal = serieNotaFiscal;
	}
	public double getNumNotaFiscal() {
		return numNotaFiscal;
	}
	public void setNumNotaFiscal(double numNotaFiscal) {
		this.numNotaFiscal = numNotaFiscal;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
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
	public double getValorMaterialAplicado() {
		return valorMaterialAplicado;
	}
	public void setValorMaterialAplicado(double valorMaterialAplicado) {
		this.valorMaterialAplicado = valorMaterialAplicado;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public double getValorDocumento() {
		return valorDocumento;
	}
	public void setValorDocumento(double valorDocumento) {
		this.valorDocumento = valorDocumento;
	}
	public double getValorIssDevido() {
		return valorIssDevido;
	}
	public void setValorIssDevido(double valorIssDevido) {
		this.valorIssDevido = valorIssDevido;
	}
	public String getIrrfBase() {
		return irrfBase;
	}
	public void setIrrfBase(String irrfBase) {
		this.irrfBase = irrfBase;
	}
	public String getIrrfAliquota() {
		return irrfAliquota;
	}
	public void setIrrfAliquota(String irrfAliquota) {
		this.irrfAliquota = irrfAliquota;
	}
	public String getIrrfValoresRetidos() {
		return irrfValoresRetidos;
	}
	public void setIrrfValoresRetidos(String irrfValoresRetidos) {
		this.irrfValoresRetidos = irrfValoresRetidos;
	}
	public String getIrrfCodRetencao() {
		return irrfCodRetencao;
	}
	public void setIrrfCodRetencao(String irrfCodRetencao) {
		this.irrfCodRetencao = irrfCodRetencao;
	}
	public String getInssbase() {
		return inssbase;
	}
	public void setInssbase(String inssbase) {
		this.inssbase = inssbase;
	}
	public String getInssAliquota() {
		return inssAliquota;
	}
	public void setInssAliquota(String inssAliquota) {
		this.inssAliquota = inssAliquota;
	}
	public String getInssValoresRetidos() {
		return inssValoresRetidos;
	}
	public void setInssValoresRetidos(String inssValoresRetidos) {
		this.inssValoresRetidos = inssValoresRetidos;
	}
	public String getInssCodRetencao() {
		return inssCodRetencao;
	}
	public void setInssCodRetencao(String inssCodRetencao) {
		this.inssCodRetencao = inssCodRetencao;
	}
	public String getPisBase() {
		return pisBase;
	}
	public void setPisBase(String pisBase) {
		this.pisBase = pisBase;
	}
	public String getPisAliquota() {
		return pisAliquota;
	}
	public void setPisAliquota(String pisAliquota) {
		this.pisAliquota = pisAliquota;
	}
	public String getPisValoresRetidos() {
		return pisValoresRetidos;
	}
	public void setPisValoresRetidos(String pisValoresRetidos) {
		this.pisValoresRetidos = pisValoresRetidos;
	}
	public String getPisCodRetencao() {
		return pisCodRetencao;
	}
	public void setPisCodRetencao(String pisCodRetencao) {
		this.pisCodRetencao = pisCodRetencao;
	}
	public String getCofinsBase() {
		return cofinsBase;
	}
	public void setCofinsBase(String cofinsBase) {
		this.cofinsBase = cofinsBase;
	}
	public String getCofinsAliquota() {
		return cofinsAliquota;
	}
	public void setCofinsAliquota(String cofinsAliquota) {
		this.cofinsAliquota = cofinsAliquota;
	}
	public String getCofinsValoresRetidos() {
		return cofinsValoresRetidos;
	}
	public void setCofinsValoresRetidos(String cofinsValoresRetidos) {
		this.cofinsValoresRetidos = cofinsValoresRetidos;
	}
	public String getCofinsCodRetencao() {
		return cofinsCodRetencao;
	}
	public void setCofinsCodRetencao(String cofinsCodRetencao) {
		this.cofinsCodRetencao = cofinsCodRetencao;
	}
	public String getSslBase() {
		return sslBase;
	}
	public void setSslBase(String sslBase) {
		this.sslBase = sslBase;
	}
	public String getSslAliquota() {
		return sslAliquota;
	}
	public void setSslAliquota(String sslAliquota) {
		this.sslAliquota = sslAliquota;
	}
	public String getSslValoresRetidos() {
		return sslValoresRetidos;
	}
	public void setSslValoresRetidos(String sslValoresRetidos) {
		this.sslValoresRetidos = sslValoresRetidos;
	}
	public String getSslCodRetencao() {
		return sslCodRetencao;
	}
	public void setSslCodRetencao(String sslCodRetencao) {
		this.sslCodRetencao = sslCodRetencao;
	}
	public String getIssBase() {
		return issBase;
	}
	public void setIssBase(String issBase) {
		this.issBase = issBase;
	}
	public String getIssAliquota() {
		return issAliquota;
	}
	public void setIssAliquota(String issAliquota) {
		this.issAliquota = issAliquota;
	}
	public String getIssValoresRetidos() {
		return issValoresRetidos;
	}
	public void setIssValoresRetidos(String issValoresRetidos) {
		this.issValoresRetidos = issValoresRetidos;
	}
	public String getIssCodRetencao() {
		return issCodRetencao;
	}
	public void setIssCodRetencao(String issCodRetencao) {
		this.issCodRetencao = issCodRetencao;
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
}
