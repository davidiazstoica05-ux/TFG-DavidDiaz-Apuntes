package com.example05.com.BorradorTrabajo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Envio {
	
	@Id @GeneratedValue
	private Long codigo_envio;
	private String direccion; 
	private double peso; 

}
