package com.ejemplo04.productos.ejemplo_04_productos_david.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo04.productos.ejemplo_04_productos_david.model.Producto;
import com.ejemplo04.productos.ejemplo_04_productos_david.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
	
	
	private final ProductoRepository repo;
	
	public List<Producto> getLista(){
		
		return repo.findAll();
		
	}
	
	
	

}
