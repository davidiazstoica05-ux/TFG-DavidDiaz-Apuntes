package com.ejemplo04.productos.ejemplo_04_productos_david.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Producto {

	
	@Id @GeneratedValue
	private Long id;
	private String nombre; 
	private double precio;
}
