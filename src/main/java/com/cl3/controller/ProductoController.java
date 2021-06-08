package com.cl3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Producto;
import com.cl3.service.ProductoService;

@RestController
@RequestMapping("/rest/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> lista() {
		return ResponseEntity.ok(service.listaProducto());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Producto>> busca(@PathVariable("id") Long id_producto) {
		Optional<Producto> producto = service.obtienePorId(id_producto);
		
		if(producto.isPresent()) {
			return ResponseEntity.ok(producto);
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/filtro/{id}")
	public ResponseEntity<List<Producto>> filtra(@PathVariable("id") Long id_categoria) {
		return ResponseEntity.ok(service.listaProductoPorCategoria(id_categoria));
	}
}
