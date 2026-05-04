package modelo;

import java.time.Duration;

public class Asignacion {
	
	private Envio envio; 
	private Ruta ruta; 
	private Repartidor repartidor;
	private boolean estado; 
	private Duration tiempoEstimado; //Aqui uso duration (ruta.distancia,)
	private double coste; 

}
