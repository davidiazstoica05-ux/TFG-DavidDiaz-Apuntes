package com.example05.com.BorradorTrabajo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example05.com.BorradorTrabajo.service.EnvioService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EnvioController {

	private final EnvioService envioService;
	
	@GetMapping("/")
	public String list(Model model) {
		
		model.addAttribute("envios",envioService.getList());
		
		return "index";
		
	}
	
	
	
}
