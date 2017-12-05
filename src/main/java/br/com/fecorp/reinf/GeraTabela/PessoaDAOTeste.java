package br.com.fecorp.reinf.GeraTabela;

import br.com.fecorp.reinf.DAO.AlunoDao;
import br.com.fecorp.reinf.model.Aluno;

public class PessoaDAOTeste {

/**
 * Classe utilizada para testar os métodos do PessoaDAO.
 */

  public static void main(String[] args) throws Exception {
    Aluno aluno = new Aluno();
    aluno.getId(1,0);
    aluno.setPeriodo("manhã");
    aluno.setName("kkkk");
    aluno.setCurso("a123");

    AlunoDao dao = new AlunoDao();
    System.out.println("Salvando a pessoa: " + aluno.getName());
    aluno = dao.saveOrUpdate(aluno);

      }
}

