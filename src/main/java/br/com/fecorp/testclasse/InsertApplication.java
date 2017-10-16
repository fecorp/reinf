package br.com.fecorp.testclasse;

import br.com.fecorp.reinf.DAO.DaoGenerico;
import br.com.fecorp.reinf.model.Pessoa;

public class InsertApplication {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
				
		pessoa.setNome("Raphael Neves");
		pessoa.setIdade(28);
		
		daoPessoa.saveOrUpdate(pessoa);
		
		System.out.println("Entidades salvas com sucesso!");
		
	}

}
