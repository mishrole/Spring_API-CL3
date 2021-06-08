package com.cl3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl3.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
