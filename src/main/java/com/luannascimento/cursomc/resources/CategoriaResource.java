package com.luannascimento.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	private Integer id;
	@Getter@Setter
	private String nome;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando";
		
	}
	
}
