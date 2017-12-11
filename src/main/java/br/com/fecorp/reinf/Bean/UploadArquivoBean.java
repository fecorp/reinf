package br.com.fecorp.reinf.Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;
import br.com.fecorp.reinf.DAO.UploadArquivoInterface;
import br.com.fecorp.reinf.model.TelaServicos;

@RequestScoped
@ManagedBean(name = "uploadArquivoBean")
public class UploadArquivoBean {

	private TelaServicos telaServicos = new TelaServicos();
	
	@ManagedProperty(name = "uploadArquivo", value = "uploadArquivo")
	private UploadArquivoInterface uploadArquivo;
	
	private Part arquivo;
	
	public void upload(){
		
		
	}

	public TelaServicos getTelaServicos() {
		return telaServicos;
	}

	public void setTelaServicos(TelaServicos telaServicos) {
		this.telaServicos = telaServicos;
	}

	public UploadArquivoInterface getUploadArquivo() {
		return uploadArquivo;
	}

	public void setUploadArquivo(UploadArquivoInterface uploadArquivo) {
		this.uploadArquivo = uploadArquivo;
	}

	public Part getArquivo() {
		return arquivo;
	}

	public void setArquivo(Part arquivo) {
		this.arquivo = arquivo;
	}
	
	
}
