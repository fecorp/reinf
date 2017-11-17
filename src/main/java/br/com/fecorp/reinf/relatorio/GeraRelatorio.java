package br.com.fecorp.reinf.relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class GeraRelatorio {

	// M�todo para realizar a conex�o com o banco de dados
	public Connection getConexao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdacademicnet", "root", "teco01");
		return conexao;
	}

	// M�todo para ser executado em JSE
	public static void main(String[] args) {
		System.out.println("Inicio");
		GeraRelatorio geraRelatorio = new GeraRelatorio();
		String path = "E:/Java/Eclipse/workspace02/JasperReportsWeb/WebContent/relatorios/";
		geraRelatorio.gerarPDF(path);
		System.out.println("Fim");
	}

	public byte[] gerarPDF(String diretorio) {
		byte[] retorno = null;
		String relatorio = diretorio + "RelAlunos.jrxml";
		String imagem = diretorio + "cherry.jpg";
		try {
			// Faz a compila��o do relat�rio
			JasperReport jasperReport = JasperCompileManager.compileReport(relatorio);

			// Cria o mapa de par�metros que ser� enviado ao relat�rio
			HashMap<String, Object> paramatros = new HashMap<String, Object>();

			// Faz o apontamento para a imagem que aparece no top do relat�rio
			paramatros.put("logo", imagem);

			// Preenche os dados do relat�rio
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramatros, getConexao());

			// Objeto para a ser retornado
			retorno = JasperRunManager.runReportToPdf(jasperReport, paramatros, getConexao());

			// Gera o arquivo PDF no caminho especificado
			JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/temp/RelatorioAlunos.pdf");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
}