package br.com.fecorp.reinf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean(name = "TesteLista")
@ViewScoped

@Entity
public class testeLista implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
		
    private int idCom;
    private int idTemaCom;
    private int idCodPartCom;
    private String textoCom;
    private int statusCom;
    private List<testeLista> lista = new ArrayList<testaLista>();
    
    public List<testeLista> listar() {
        return this.lista;
    }
    
    public String insereComentario() {
        lista.add(this);
        return "sucesso";
    }

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public int getIdTemaCom() {
		return idTemaCom;
	}

	public void setIdTemaCom(int idTemaCom) {
		this.idTemaCom = idTemaCom;
	}

	public int getIdCodPartCom() {
		return idCodPartCom;
	}

	public void setIdCodPartCom(int idCodPartCom) {
		this.idCodPartCom = idCodPartCom;
	}

	public String getTextoCom() {
		return textoCom;
	}

	public void setTextoCom(String textoCom) {
		this.textoCom = textoCom;
	}

	public int getStatusCom() {
		return statusCom;
	}

	public void setStatusCom(int statusCom) {
		this.statusCom = statusCom;
	}
    
}