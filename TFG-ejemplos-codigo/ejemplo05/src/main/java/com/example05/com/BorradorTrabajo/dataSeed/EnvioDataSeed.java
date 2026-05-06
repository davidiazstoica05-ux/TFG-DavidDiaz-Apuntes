package com.example05.com.BorradorTrabajo.dataSeed;

import org.springframework.stereotype.Component;

import com.example05.com.BorradorTrabajo.model.Envio;
import com.example05.com.BorradorTrabajo.repo.EnvioRepo;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EnvioDataSeed {
	
	private final EnvioRepo envioRepo; 
	
	@PostConstruct
	public void run() {
		
		envioRepo.save(
				Envio.builder()
					.direccion("Osuna")
					.peso(1.2)
					.build()
					);
		envioRepo.save(
				Envio.builder()
					.direccion("Sevilla")
					.peso(2.5)
					.build()
					
				);
		envioRepo.save(
				Envio.builder()
					.direccion("Écija")
					.peso(3.8)
					.build()
				);

		envioRepo.save(
				Envio.builder()
					.direccion("Marchena")
					.peso(0.5)
					.build()
				);

		envioRepo.save(
				Envio.builder()
					.direccion("Carmona")
					.peso(5.1)
					.build()
				);
		
		
	}
	
	
	
	

}
