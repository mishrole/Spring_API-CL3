package com.cl3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Categoria;
import com.cl3.repository.CategoriaRepository;

@Service
public class CategoriaServiceImp implements CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;

	@Override
	public List<Categoria> listaCategoria() {
		return repository.findAll();
	}

	@Override
	public Optional<Categoria> obtienePorId(Long id_categoria) {
		return repository.findById(id_categoria);
	}
	
}
