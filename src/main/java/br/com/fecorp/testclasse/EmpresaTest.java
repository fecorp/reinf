package br.com.fecorp.testclasse;

import java.util.List;
import br.com.fecorp.reinf.DAO.EmpresaDAO;
import br.com.fecorp.reinf.impl.EmpresaDAOImpl;
import br.com.fecorp.reinf.model.Empresa;

public class EmpresaTest {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.setEmpresa("Fecorp");
		empresa.bairro("Centro");
		empresa.cep(3399);

		EmpresaDAO empresaDAO = new EmpresaDAOImpl();

		// salva uma empresa
		empresaDAO.save(empresa);

		List<Empresa> listaEmpresaCadastrados = empresaDAO.getAll(Empresa.class);

		for (Empresa e : listaEmpresaCadastrados) {
			System.out.println(e.getEmpresa());
		}

	}
}
