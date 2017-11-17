package br.com.fecorp.reinf.relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class GeraRelatorio {

	// Método para realizar a conexão com o banco de dados
	public Connection getConexao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdacademicnet", "root", "teco01");
		return conexao;
	}

	// Método para ser executado em JSE
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
			// Faz a compilação do relatório
			JasperReport jasperReport = JasperCompileManager.compileReport(relatorio);

			// Cria o mapa de parâmetros que será enviado ao relatório
			HashMap<String, Object> paramatros = new HashMap<String, Object>();

			// Faz o apontamento para a imagem que aparece no top do relatório
			paramatros.put("logo", imagem);

			// Preenche os dados do relatório
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