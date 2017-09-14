package br.com.fecorp.reinf.control;



import java.io.Serializable;

public class User implements Serializable {
 
    private String empresa;
     
    private String filial;
     
    private Integer dataatualizacao;
     
    private String street;
     
    private String city;
     
    private String postalCode;
     
    private String info;
     
    private String email;
     
    private String phone;
 
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
 
    public Integer getDataatualizacao() {
        return dataatualizacao;
    }
 
    public void setDataatualizacao(Integer dataatualizacao) {
        this.dataatualizacao = dataatualizacao;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getPostalCode() {
        return postalCode;
    }
 
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
 
    public String getInfo() {
        return info;
    }
 
    public void setInfo(String info) {
        this.info = info;
    }
     
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
}