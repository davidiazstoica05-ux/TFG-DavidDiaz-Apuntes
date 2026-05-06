package com.example05.com.BorradorTrabajo.model;

import java.time.LocalDateTime;

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
public class RUta {
	
	@Id @GeneratedValue
	private Long codigo_ruta;
	private LocalDateTime fecha; 
	private double distancia; 
	
}
