package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import util.FacesUtil;

@ManagedBean
@ViewScoped

public class CadastroBean {
	public void salvar(){
		
		FacesUtil.adicionarMsgInfo("Campo Obrigatório ! ");
	}
}
