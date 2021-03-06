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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@ManagedBean(name = "ProcessosAdmJud")
@ViewScoped

@Entity
public class ProcessosADMJud implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

		private String empresa;
		private String filial;
		private String tipoProcesso;
		private String numProcAdmJud;
		
		@Temporal(TemporalType.DATE)
		private Date dataDecisaoSent_DespAdm;
		private BigDecimal codIndicativoSuspe;
		private String indiSuspeExigi;
		private String indiDepMonteIntegral;
		private String idUniFederacao_UFJud;
		private BigDecimal codMunicipio;
		private String codIdVara;
		private String UFSessaoJud;
		private BigDecimal indiAutoriaJud;
		private String openFlex01;
		private String openFlex02;
		
		
		
		



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



		public String getTipoProcesso() {
			return tipoProcesso;
		}



		public void setTipoProcesso(String tipoProcesso) {
			this.tipoProcesso = tipoProcesso;
		}



		public String getNumProcAdmJud() {
			return numProcAdmJud;
		}



		public void setNumProcAdmJud(String numProcAdmJud) {
			this.numProcAdmJud = numProcAdmJud;
		}



		public Date getDataDecisaoSent_DespAdm() {
			return dataDecisaoSent_DespAdm;
		}



		public void setDataDecisaoSent_DespAdm(Date dataDecisaoSent_DespAdm) {
			this.dataDecisaoSent_DespAdm = dataDecisaoSent_DespAdm;
		}



		public BigDecimal getCodIndicativoSuspe() {
			return codIndicativoSuspe;
		}



		public void setCodIndicativoSuspe(BigDecimal codIndicativoSuspe) {
			this.codIndicativoSuspe = codIndicativoSuspe;
		}



		public String getIndiSuspeExigi() {
			return indiSuspeExigi;
		}



		public void setIndiSuspeExigi(String indiSuspeExigi) {
			this.indiSuspeExigi = indiSuspeExigi;
		}



		public String getIndiDepMonteIntegral() {
			return indiDepMonteIntegral;
		}



		public void setIndiDepMonteIntegral(String indiDepMonteIntegral) {
			this.indiDepMonteIntegral = indiDepMonteIntegral;
		}



		public String getIdUniFederacao_UFJud() {
			return idUniFederacao_UFJud;
		}



		public void setIdUniFederacao_UFJud(String idUniFederacao_UFJud) {
			this.idUniFederacao_UFJud = idUniFederacao_UFJud;
		}



		public BigDecimal getCodMunicipio() {
			return codMunicipio;
		}



		public void setCodMunicipio(BigDecimal codMunicipio) {
			this.codMunicipio = codMunicipio;
		}



		public String getCodIdVara() {
			return codIdVara;
		}



		public void setCodIdVara(String codIdVara) {
			this.codIdVara = codIdVara;
		}



		public String getUFSessaoJud() {
			return UFSessaoJud;
		}



		public void setUFSessaoJud(String uFSessaoJud) {
			UFSessaoJud = uFSessaoJud;
		}



		public BigDecimal getIndiAutoriaJud() {
			return indiAutoriaJud;
		}



		public void setIndiAutoriaJud(BigDecimal indiAutoriaJud) {
			this.indiAutoriaJud = indiAutoriaJud;
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

