package com.cl3.service;

import java.util.List;
import java.util.Optional;

import com.cl3.entity.Categoria;

public interface CategoriaService {
	
	public abstract List<Categoria> listaCategoria();
	public abstract Optional<Categoria> obtienePorId(Long id_categoria);
}
