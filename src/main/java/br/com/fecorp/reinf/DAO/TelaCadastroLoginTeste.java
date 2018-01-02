package br.com.fecorp.reinf.DAO;

import br.com.fecorp.reinf.model.TelaCadastroLogin;

public class TelaCadastroLoginTeste {
	
	public static void main(String[] args)throws Exception{
		
			    TelaCadastroLogin cadastroLogin = new TelaCadastroLogin();
			    cadastroLogin.setDepartamento("Desenvolvimento");
			   
			    cadastroLogin.setNome("Roger");
			    cadastroLogin.setLogin("AMORIM");
			    cadastroLogin.setSenha("12345");

			    TelaCadastroLoginDAO dao = new TelaCadastroLoginDAO();
			    System.out.println("Salvando a pessoa: " + cadastroLogin.getDepartamento());
			    cadastroLogin = dao.salvar(cadastroLogin);

			    	}

}
