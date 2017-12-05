package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {
	public static void adicionarMsgInfo(String mensagem){
		
	}
	public static void adicionarMsgErro(String mensagem){
		FacesMessage facesMessage = new  FacesMessage (FacesMessage.SEVERITY_WARN, mensagem, mensagem);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null ,facesMessage);
	}
	
}
