package br.com.fecorp.reinf.DAO;

import java.util.List;

import br.com.fecorp.reinf.model.TelaCadastroLogin;

public interface TelaCadastroLoginDAO {

	public void salvar(TelaCadastroLogin cadastroLogin);
	public void deletar(String nome);
	public void atualizar(TelaCadastroLogin cadastrologin);
	public List<TelaCadastroLogin> listar();
	public TelaCadastroLogin getTelaCadastroLoginById(String nome);

}








