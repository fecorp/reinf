package br.com.fecorp.reinf.DAO;

import java.io.Serializable;

/**
 * Classe basica para criação das Entity's.
 */
public interface EntidadeBase {
	
	/**
	 * @return o Id da Entity.
	 */
	public Serializable getId();
}