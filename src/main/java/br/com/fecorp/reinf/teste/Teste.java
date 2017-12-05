package br.com.fecorp.reinf.teste;

import br.com.fecorp.reinf.DAO.TelaServicosDAO;
import br.com.fecorp.reinf.model.TelaServicos;


public class Teste {

	public static void main(String[]args){
	
		TelaServicosDAO telaServicosDAO = new TelaServicosDAO();
		TelaServicos servico = new TelaServicos();
		
		servico.setEmpresa("Calves");
		servico.setCodFilial("888888");
		
		telaServicosDAO.saveOrUpdate(servico);
	}
	
}
