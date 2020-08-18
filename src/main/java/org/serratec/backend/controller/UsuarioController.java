package org.serratec.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	//salvar
	@PostMapping
	public void salvar(@RequestBody Usuario usuario) {
		System.out.println(usuario.getNome());
		usuarios.add(usuario);
	}
	
	//listar
	@GetMapping
	public List<Usuario> listar(){
		return usuarios;
	}
	
}