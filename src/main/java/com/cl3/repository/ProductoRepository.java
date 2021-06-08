package com.cl3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cl3.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	@Query("Select p from Producto p, Categoria c where p.categoria.id_categoria = c.id_categoria and p.categoria.id_categoria like :param_categoria")
	public abstract List<Producto> listaProductoPorCategoria(@Param("param_categoria") Long id_categoria);

}
