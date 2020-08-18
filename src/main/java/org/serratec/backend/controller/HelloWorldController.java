package org.serratec.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	
	//localhost:8080/api/bem-vindo?nome=Edson&sobrenome=Galdino
	@GetMapping("bem-vindo")
	public String bemVindo(@RequestParam String nome, @RequestParam String sobrenome) {
		return "Seja bem vindx, " + nome;
	}
	
	//localhost:8080/api/bem-vindo/Edson
	@GetMapping("bem-vindo/{nome}")
	public String bemVindoPath(@PathVariable String nome) {
		return "Seja bem vindx, " + nome;
	}
	
	//localhost:8080/api/bem-vindo
	// No postman body: Edson
	@PostMapping("bem-vindo")
	public String bemVindoBody(@RequestBody String nome) {
		return "Seja bem vindx, " + nome;
	}
	
	
}
