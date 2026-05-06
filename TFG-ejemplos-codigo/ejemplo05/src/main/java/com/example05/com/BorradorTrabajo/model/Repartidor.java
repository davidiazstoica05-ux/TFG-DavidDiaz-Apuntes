package com.example05.com.BorradorTrabajo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Repartidor {
	
	@Id
	private String dni; 
	private String zona; 
	private String nombre;
	@ManyToOne @JoinColumn(
			name = "cod_ruta",
			foreignKey = @ForeignKey(name = "fk_cod_ruta") 
			)
	private RUta ruta;
	
}
