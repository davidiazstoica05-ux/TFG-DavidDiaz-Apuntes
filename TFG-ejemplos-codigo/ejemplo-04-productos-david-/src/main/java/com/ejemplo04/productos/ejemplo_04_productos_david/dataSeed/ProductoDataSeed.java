package com.ejemplo04.productos.ejemplo_04_productos_david.dataSeed;

import org.springframework.stereotype.Component;

import com.ejemplo04.productos.ejemplo_04_productos_david.model.Producto;
import com.ejemplo04.productos.ejemplo_04_productos_david.repository.ProductoRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductoDataSeed {
	
	private final ProductoRepository repo; 
	
	@PostConstruct
	public void run() {
		
		repo.save(
			Producto.builder()
						.nombre("Katana")
						.precio(2.5)
					.build());
		repo.save(Producto.builder()
						  	.nombre("gafas")
						  	.precio(1.2)
						  .build());
		
	}

}
