package com.example05.com.BorradorTrabajo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example05.com.BorradorTrabajo.model.Envio;

public interface EnvioRepo 
		extends JpaRepository <Envio, Long>{

}
