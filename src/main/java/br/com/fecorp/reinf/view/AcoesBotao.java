
package br.com.fecorp.reinf.view;

import javax.faces.context.FacesContext;

public class AcoesBotao {

	
	    private String productId;
	    private String botaoPesquisar;
	 
	    public String getProductId() {
	        return productId;
	    }
	 
	    public void setProductId(String productId) {
	        this.productId = productId;
	    }
/*
 * karin 26/10/2017
 */
		public String getBotaoPesquisar() {
			return "TelaPesquisaServEntradaSaida.xhtml";
		}

		public void setBotaoPesquisar(String botaoPesquisa) {
			this.botaoPesquisar = botaoPesquisa;
		}
	    
		
		
}










