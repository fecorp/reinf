package br.com.fecorp.reinf.servicos;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fecorp.reinf.DAO.TelaCadastroLoginDAO;
import br.com.fecorp.reinf.model.TelaCadastroLogin;

@Service
@ManagedBean(name="TelaCadastrologinServiceImpl")
@SessionScoped
public class TelaCadastrologinServiceImpl implements TelaCadastroLoginService, Serializable{

	private static final long serialVersionUID = 1L;

	private TelaCadastroLoginDAO cadastroLoginDAO;

	public void setCadastroLoginDAO(TelaCadastroLoginDAO cadastroLoginDAO) {
		this.cadastroLoginDAO = cadastroLoginDAO;
	}





	@Override
	@Transactional
	public void salvar(TelaCadastroLogin cadastroLogin) {
		this.cadastroLoginDAO.salvar(cadastroLogin);
	}

	@Override
	@Transactional
	public void deletar(String nome) {
		this.cadastroLoginDAO.deletar(nome);

	}

	@Override
	@Transactional
	public void atualizar(TelaCadastroLogin cadastrologin) {
		this.cadastroLoginDAO.atualizar(cadastrologin);

	}

	@Override
	@Transactional
	public List<TelaCadastroLogin> listar() {
		return this.cadastroLoginDAO.listar();

	}





	@Override
	@Transactional
	public TelaCadastroLogin getTelaCadastroLoginById(String nome) {
		return this.cadastroLoginDAO.getTelaCadastroLoginById(nome);


	}

}
