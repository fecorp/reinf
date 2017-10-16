package br.com.fecorp.testclasse;

import br.com.fecorp.reinf.DAO.DaoGenerico;
import br.com.fecorp.reinf.model.Pessoa;

public class FindByIdApplication {
	
	public static void main(String[] args) {
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
	
		
		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
	
		System.out.println("### Entidade Pessoa encontrada ###");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());
				
	}

}
