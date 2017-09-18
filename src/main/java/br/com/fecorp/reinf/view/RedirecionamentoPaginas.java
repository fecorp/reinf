package br.com.fecorp.reinf.view;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RedirecionamentoPaginas {
	private String dynamicaPagesInclude;

    public String getDynamicaPagesInclude() {
        return dynamicaPagesInclude;
    }

    public void setDynamicaPagesInclude(String dynamicaPagesInclude) {
        this.dynamicaPagesInclude = dynamicaPagesInclude;
    }

    public void changePage(int itemSelected ) {
        if (itemSelected == 1) {
            dynamicaPagesInclude = "telaCadastro.xhtml";
        } else {
            dynamicaPagesInclude = "index.xhtml";
        }
    }
}
