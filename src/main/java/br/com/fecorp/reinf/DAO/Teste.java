package br.com.fecorp.reinf.DAO;



import br.com.fecorp.reinf.model.TelaCadastroLogin;

public class Teste {

	public static void main(String[] args) {
		
		TelaCadastroLogin cadastro = new TelaCadastroLogin();
		cadastro.setLogin("v");
		cadastro.setNome("v");
		cadastro.setDepartamento("v");
		cadastro.setSenha("v");
		
		TelaCadastroLoginDAO dao = new TelaCadastroLoginDAOImpl();
		
		dao.save(cadastro);
			
			
	}
}


