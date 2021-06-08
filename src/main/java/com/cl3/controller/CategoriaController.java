package com.cl3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Categoria;
import com.cl3.service.CategoriaService;

@RestController
@RequestMapping("/rest/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> lista() {
		return ResponseEntity.ok(service.listaCategoria());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Categoria>> busca(@PathVariable("id") Long id_categoria) {
		Optional<Categoria> categoria = service.obtienePorId(id_categoria);
		
		if(categoria.isPresent()) {
			return ResponseEntity.ok(categoria);
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
}
