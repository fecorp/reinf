package br.com.fecorp.reinf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fecorp.reinf.DAO.EntidadeBase;

	@Entity
	public class Responsavel implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private String nomeContato;
	private String cpfContato;
	private String numeroTelefone;
	private String telefoneCelular;
	private String email;
	private String dataInicioVigencia;
	private String dataNascimento;
	private String sexo;
	private String rg;
	private String empresa;
	private String filial;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String nomeMae;
	private String nomePai;
	private String observacoes;
	private String qualificacao;
	private String crc;
	private String dataFinalVigencia;
	private String openflex01;
	private String openflex02;
	
	
	
	public String getNomeContato() {
		return nomeContato;
	}



	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}



	public String getCpfContato() {
		return cpfContato;
	}



	public void setCpfContato(String cpfContato) {
		this.cpfContato = cpfContato;
	}



	public String getNumeroTelefone() {
		return numeroTelefone;
	}



	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}



	public String getTelefoneCelular() {
		return telefoneCelular;
	}



	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDataInicioVigencia() {
		return dataInicioVigencia;
	}



	public void setDataInicioVigencia(String dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



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



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getNomeMae() {
		return nomeMae;
	}



	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}



	public String getNomePai() {
		return nomePai;
	}



	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}



	public String getObservacoes() {
		return observacoes;
	}



	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}



	public String getQualificacao() {
		return qualificacao;
	}



	public void setQualificacao(String qualificacao) {
		this.qualificacao = qualificacao;
	}



	public String getCrc() {
		return crc;
	}



	public void setCrc(String crc) {
		this.crc = crc;
	}



	public String getDataFinalVigencia() {
		return dataFinalVigencia;
	}



	public void setDataFinalVigencia(String dataFinalVigencia) {
		this.dataFinalVigencia = dataFinalVigencia;
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



	public long getSerialversionuid() {
		return serialVersionUID;
	}



	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}
  } 	

