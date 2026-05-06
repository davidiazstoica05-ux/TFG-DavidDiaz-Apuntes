package com.example05.com.BorradorTrabajo.model;

import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
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
public class Asignacion {

	@Id @GeneratedValue
	private Long id; 
	private Duration tiempoEstimado;
	private double coste; 
	@ManyToOne @JoinColumn(
			name = "id_envio",
			foreignKey = @ForeignKey(name = "fk_id_envio") 
			)
	private Envio envio;
	private boolean estado; 
	@ManyToOne @JoinColumn(
			name = "dni_repartidor",
			foreignKey = @ForeignKey(name = "fk_dni_repartidor")
			)
	private Repartidor dni; 
	@ManyToOne @JoinColumn(
			name = "cod_ruta",
			foreignKey = @ForeignKey(name = "fk_cod_ruta") 
			)
	private RUta ruta; 
}
