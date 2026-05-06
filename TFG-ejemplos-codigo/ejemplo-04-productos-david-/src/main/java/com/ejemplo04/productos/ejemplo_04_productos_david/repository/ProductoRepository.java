package com.ejemplo04.productos.ejemplo_04_productos_david.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo04.productos.ejemplo_04_productos_david.model.Producto;


public interface ProductoRepository
	extends JpaRepository<Producto, Long> {

}
