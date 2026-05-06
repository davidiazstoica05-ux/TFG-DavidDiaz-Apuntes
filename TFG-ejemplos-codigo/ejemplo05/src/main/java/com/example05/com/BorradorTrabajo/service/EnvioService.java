package com.example05.com.BorradorTrabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example05.com.BorradorTrabajo.model.Envio;
import com.example05.com.BorradorTrabajo.repo.EnvioRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnvioService {

	private final EnvioRepo repo; 
	
	public List<Envio> getList(){
		
		return repo.findAll();
		
	}
	
}
