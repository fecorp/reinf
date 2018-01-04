package br.com.fecorp.reinf.control;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fecorp.reinf.model.TelaCadastroLogin;
import br.com.fecorp.reinf.servicos.TelaCadastroLoginService;

@Controller
public class TelaCadastroLoginController {

	private TelaCadastroLoginService cadastroLoginService;

	
	@Autowired(required=true)
	@Qualifier(value="TelaCadastroLoginService")
	public void setCadastroLoginService(TelaCadastroLoginService cadastroLoginService) {
		this.cadastroLoginService = cadastroLoginService;
	}
	
	
	
	
	
	@RequestMapping(value = "/cadastroLogin", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("cadastrologin", new TelaCadastroLogin());
		model.addAttribute("listarCadastro", this.cadastroLoginService.listar());
		return "cadastroLogin";
	}
	
	//For add and update person both
	@RequestMapping(value= "/cadastro/salvar", method = RequestMethod.POST)
	public String salvar(@ModelAttribute("cadastroLogin") TelaCadastroLogin cadastrologin){
		
		if(cadastrologin.getNome() == null){
			//new person, add it
			this.cadastroLoginService.salvar(cadastrologin);
		}else{
			//existing person, call update
			this.cadastroLoginService.atualizar(cadastrologin);
		}
		
		return "redirect:/cadastrologin";
		
	}
	
	@RequestMapping("/deletar/{nome}")
    public String deletar(@PathVariable("nome") String nome){
		
        this.cadastroLoginService.deletar(nome);
        return "redirect:/cadastrologin";
    }
 
    @RequestMapping("/atualizar/{nome}")
    public String atualizar(@PathVariable("nome") String nome, Model model){
        model.addAttribute("cadastroLogin", this.cadastroLoginService.getTelaCadastroLoginById(nome));
        model.addAttribute("listarCadastroLogin", this.cadastroLoginService.listar());
        return "cadastroLogin";
    }
	
	
}
