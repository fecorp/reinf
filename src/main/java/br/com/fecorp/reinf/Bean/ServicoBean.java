package br.com.fecorp.reinf.Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fecorp.reinf.DAO.TelaServicosDAO;
import br.com.fecorp.reinf.model.TelaServicos;

@ManagedBean(name = "ServicosMB")
@ViewScoped
public class ServicoBean {
	private TelaServicosDAO telaServicosDAO = new TelaServicosDAO();
	private TelaServicos telaServicos = new TelaServicos();

	public String envia() {
		telaServicos = telaServicosDAO.getTelaServicos(telaServicos.getEmpresa(), telaServicos.getCodFilial());
		if (telaServicos.getEmpresa() == null) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Campo Obrigatório", null));
			return null;
		} else {

		}
		return null;

	}

	public TelaServicosDAO getTelaServicosDAO() {
		return telaServicosDAO;
	}

	public void setTelaServicosDAO(TelaServicosDAO telaServicosDAO) {
		this.telaServicosDAO = telaServicosDAO;
	}

	public TelaServicos getTelaServicos() {
		return telaServicos;
	}

	public void setTelaServicos(TelaServicos telaServicos) {
		this.telaServicos = telaServicos;
	}

}
