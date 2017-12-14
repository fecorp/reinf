package br.com.fecorp.reinf.Bean;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;
import com.lowagie.text.pdf.codec.Base64.InputStream;
import br.com.fecorp.reinf.DAO.UploadArquivoInterface;
import br.com.fecorp.reinf.model.TelaServicos;

@RequestScoped
@ManagedBean(name = "uploadArquivoBean")
public class UploadArquivoBean {

	private TelaServicos telaServicos = new TelaServicos();
	
	@ManagedProperty(name = "uploadArquivo", value = "#{uploadArquivo}")
	private UploadArquivoInterface uploadArquivo;
	
	private Part arquivo;
	
	public void upload() throws IOException{
		
		// LENDO ARQUIVO CSV
		
		Scanner scanner = new Scanner(arquivo.getInputStream(), "UTF-8");
		scanner.useDelimiter(",");
		
		while(scanner.hasNext()){
			String linha = scanner.nextLine();
			
			if(linha != null && !linha.trim().isEmpty()){
				linha = linha.replaceAll("\"", "");
				
				String[] dados = linha.split("\\,");
				
				System.out.println(linha);
			}
			
			
		}
		
		// LENDO ARQUIVO CSV
		
		System.out.println(arquivo.getContentType());
		
		byte[] arquivoByte = toByteArrayUsingJava(arquivo.getInputStream());
		
		//telaServicos.setArquivo(arquivoByte);
		
		uploadArquivo.salvar(telaServicos);
		
		Scanner conteudo = new Scanner(arquivo.getInputStream());
		
		while(conteudo.hasNext()){
			System.out.println(conteudo.next());
		}
	    
	}

	public TelaServicos getTelaServicos() {
		return telaServicos;
	}

	public void setTelaServicos(TelaServicos telaServicos) {
		this.telaServicos = telaServicos;
	}

	public UploadArquivoInterface getUploadArquivo() {
		return uploadArquivo;
	}

	public void setUploadArquivo(UploadArquivoInterface uploadArquivo) {
		this.uploadArquivo = uploadArquivo;
	}

	public Part getArquivo() {
		return arquivo;
	}

	public void setArquivo(Part arquivo) {
		this.arquivo = arquivo;
	}
	
	public byte[] toByteArrayUsingJava(java.io.InputStream inputStream) throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int reads = inputStream.read();
		while(reads != -1){
			baos.write(reads);
			reads = inputStream.read();
		}
		return baos.toByteArray();
	}
	
}
