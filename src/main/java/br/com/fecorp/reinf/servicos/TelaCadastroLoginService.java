package br.com.fecorp.reinf.servicos;

import java.util.List;

import br.com.fecorp.reinf.model.TelaCadastroLogin;

public interface TelaCadastroLoginService {

	public void salvar(TelaCadastroLogin cadastroLogin);
	public void deletar(String nome);
	public void atualizar(TelaCadastroLogin cadastrologin);
	public List<TelaCadastroLogin> listar();
	public TelaCadastroLogin getTelaCadastroLoginById(String nome);
		
}
