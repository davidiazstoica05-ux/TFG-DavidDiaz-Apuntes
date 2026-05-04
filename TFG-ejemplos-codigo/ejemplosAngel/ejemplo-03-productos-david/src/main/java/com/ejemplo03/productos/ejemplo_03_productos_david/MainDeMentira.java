package com.ejemplo03.productos.ejemplo_03_productos_david;

import org.springframework.stereotype.Component;

import com.ejemplo03.productos.ejemplo_03_productos_david.model.Producto;
import com.ejemplo03.productos.ejemplo_03_productos_david.repository.ProductoRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {

	private final ProductoRepository repo; 
	
	@PostConstruct
	public void run() {
		
		repo.save(
				Producto.builder()
					.nombre("Bocatas Manolo")
					.precio(2.3)
				.build()		
		);
		
		repo.save(
				Producto.builder()
					.nombre("Camiseta der beti")
					.precio(45.7)
				.build()
		);
		
		repo.save(
				Producto.builder()
					.nombre("FFX")
					.precio(29.99)
				.build()
				
				);

}
	

	
	

}
