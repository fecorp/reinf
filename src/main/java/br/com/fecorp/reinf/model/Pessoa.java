package br.com.fecorp.reinf.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* Classe utilizada para representar uma Pessoa.
*/
@Entity
public class Pessoa implements Serializable {
  /* Serial Version UID */
  private static final long SERIAL_VERSION_UID = 5486103235574819424L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
}
