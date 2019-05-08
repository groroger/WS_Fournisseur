package fr.afcepf.al33.ws_fournisseur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {

	@GetMapping("/")
	public String home(@RequestParam(required=false, defaultValue="buddy") String nom, ModelMap modelMap) {
		
		modelMap.put("name", nom);
		return "pages/home";
	}
}
