package com.cl3.service;

import java.util.List;
import java.util.Optional;

import com.cl3.entity.Producto;

public interface ProductoService {
	
	public abstract List<Producto> listaProducto();
	public abstract List<Producto> listaProductoPorCategoria(Long id_categoria);
	public abstract Optional<Producto> obtienePorId(Long id_producto);

}
