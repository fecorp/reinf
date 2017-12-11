package br.com.fecorp.reinf.DAO;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import br.com.fecorp.reinf.model.TelaServicos;

@Repository("uploadArquivo")
@Transactional
@EnableTransactionManagement
public class UploadArquivoDaoImpl extends GenericDAO implements UploadArquivoInterface{

	public void salvar(TelaServicos arquivoUpload) {
		super.em.persist(arquivoUpload);
		
	}

	
}
