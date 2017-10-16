package br.com.fecorp.testclasse;

import br.com.fecorp.reinf.DAO.DaoGenerico;
import br.com.fecorp.reinf.model.Pessoa;

public class RemoveApplication {
	public static void main(String[] args) {
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		
		
		daoPessoa.remove(Pessoa.class, 1L);
		
		
		System.out.println("Entidades removidas com sucesso!");
		
	}
}
