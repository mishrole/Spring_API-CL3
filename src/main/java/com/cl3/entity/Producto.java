package com.cl3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_producto")
@Getter
@Setter

public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	private String nombre_producto;
	
	private String descripcion_producto;
	
	private Double precio_producto;
	
	private Integer stock_producto;
	
	private String imagen_producto;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", insertable = false, updatable = false, nullable = false)
	private Categoria categoria;
	
}
