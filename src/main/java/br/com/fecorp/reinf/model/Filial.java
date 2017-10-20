package br.com.fecorp.reinf.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.fecorp.reinf.DAO.EntidadeBase;

@ManagedBean(name = "Filial")
@ViewScoped

@Entity
public class Filial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	
	private String empresa;
	private String complementoEnd;
	private String filial;
	private String dataAtualizacao;
	private String categoriaPFPJ;
	private String codigoPFPJ;
	private String cnpj;
	private String cpf;
	private String indPessoa;
	private String insEstadual;
	private String insMunicipal;
	private String nomeRazaoSocial;
	private String nomeFantasia;
	private String endereco;
	private String numero;
	private String bairro;
	private String municipio;
	private String unidadeFederativa;
	private String cep;
	private String indProdRural;
	private String pais;
	private String insSuframa;
	private String tipoLocalidade;
	private String codLocalidade;
	private String cadInss;
	private String nit;
	private String caixaPostal;
	private String cepCaixaPostal;
	private String dddTelefone;
	private String numeroTelefone;
	private String dddFax;
	private String numeroFax;
	private String codMunIBGE;
	private String classFical;
	private String situacaoPJ;
	private String numeroCNO;
	private String dataCriacao;
	private String indicativoPJ;
	private String dataEncerramento;
	private String openflex01; 
	private String openflex02;



	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getComplementoEnd() {
		return complementoEnd;
	}




	public void setComplementoEnd(String complementoEnd) {
		this.complementoEnd = complementoEnd;
	}


	public String getFilial() {
		return filial;
	}




	public void setFilial(String filial) {
		this.filial = filial;
	}




	public String getDataAtualizacao() {
		return dataAtualizacao;
	}




	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}




	public String getCategoriaPFPJ() {
		return categoriaPFPJ;
	}




	public void setCategoriaPFPJ(String categoriaPFPJ) {
		this.categoriaPFPJ = categoriaPFPJ;
	}




	public String getCodigoPFPJ() {
		return codigoPFPJ;
	}




	public void setCodigoPFPJ(String codigoPFPJ) {
		this.codigoPFPJ = codigoPFPJ;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getIndPessoa() {
		return indPessoa;
	}




	public void setIndPessoa(String indPessoa) {
		this.indPessoa = indPessoa;
	}




	public String getInsEstadual() {
		return insEstadual;
	}




	public void setInsEstadual(String insEstadual) {
		this.insEstadual = insEstadual;
	}




	public String getInsMunicipal() {
		return insMunicipal;
	}




	public void setInsMunicipal(String insMunicipal) {
		this.insMunicipal = insMunicipal;
	}




	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}




	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}




	public String getNomeFantasia() {
		return nomeFantasia;
	}




	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}




	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getIndProdRural() {
		return indProdRural;
	}




	public void setIndProdRural(String indProdRural) {
		this.indProdRural = indProdRural;
	}




	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public String getInsSuframa() {
		return insSuframa;
	}




	public void setInsSuframa(String insSuframa) {
		this.insSuframa = insSuframa;
	}




	public String getTipoLocalidade() {
		return tipoLocalidade;
	}




	public void setTipoLocalidade(String tipoLocalidade) {
		this.tipoLocalidade = tipoLocalidade;
	}




	public String getCodLocalidade() {
		return codLocalidade;
	}




	public void setCodLocalidade(String codLocalidade) {
		this.codLocalidade = codLocalidade;
	}




	public String getCadInss() {
		return cadInss;
	}




	public void setCadInss(String cadInss) {
		this.cadInss = cadInss;
	}




	public String getNit() {
		return nit;
	}




	public void setNit(String nit) {
		this.nit = nit;
	}




	public String getCaixaPostal() {
		return caixaPostal;
	}




	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}




	public String getCepCaixaPostal() {
		return cepCaixaPostal;
	}




	public void setCepCaixaPostal(String cepCaixaPostal) {
		this.cepCaixaPostal = cepCaixaPostal;
	}




	public String getDddTelefone() {
		return dddTelefone;
	}




	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}




	public String getNumeroTelefone() {
		return numeroTelefone;
	}




	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}




	public String getDddFax() {
		return dddFax;
	}




	public void setDddFax(String dddFax) {
		this.dddFax = dddFax;
	}




	public String getNumeroFax() {
		return numeroFax;
	}




	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}




	public String getCodMunIBGE() {
		return codMunIBGE;
	}




	public void setCodMunIBGE(String codMunIBGE) {
		this.codMunIBGE = codMunIBGE;
	}




	public String getClassFical() {
		return classFical;
	}




	public void setClassFical(String classFical) {
		this.classFical = classFical;
	}




	public String getSituacaoPJ() {
		return situacaoPJ;
	}




	public void setSituacaoPJ(String situacaoPJ) {
		this.situacaoPJ = situacaoPJ;
	}




	public String getNumeroCNO() {
		return numeroCNO;
	}




	public void setNumeroCNO(String numeroCNO) {
		this.numeroCNO = numeroCNO;
	}




	public String getDataCriacao() {
		return dataCriacao;
	}




	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}




	public String getIndicativoPJ() {
		return indicativoPJ;
	}




	public void setIndicativoPJ(String indicativoPJ) {
		this.indicativoPJ = indicativoPJ;
	}




	public String getDataEncerramento() {
		return dataEncerramento;
	}




	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}




	public String getOpenflex01() {
		return openflex01;
	}




	public void setOpenflex01(String openflex01) {
		this.openflex01 = openflex01;
	}




	public String getOpenflex02() {
		return openflex02;
	}




	public void setOpenflex02(String openflex02) {
		this.openflex02 = openflex02;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}		

}
