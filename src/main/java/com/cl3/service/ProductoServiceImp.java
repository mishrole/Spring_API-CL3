package com.cl3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Producto;
import com.cl3.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listaProducto() {
		return repository.findAll();
	}

	@Override
	public List<Producto> listaProductoPorCategoria(Long id_categoria) {
		return repository.listaProductoPorCategoria(id_categoria);
	}

	@Override
	public Optional<Producto> obtienePorId(Long id_producto) {
		return repository.findById(id_producto);
	}
	
}
