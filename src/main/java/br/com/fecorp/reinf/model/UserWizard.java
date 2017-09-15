
package br.com.fecorp.reinf.model;
 

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.FlowEvent;
import br.com.fecorp.reinf.control.Usuario;

 
@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {
 
    private Usuario user = new Usuario();
     
    private boolean skip;
     
    public Usuario getUser() {
        return user;
    }
 
    public void setUser(Usuario user) {
        this.user = user;
    }
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getEmpresa());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}