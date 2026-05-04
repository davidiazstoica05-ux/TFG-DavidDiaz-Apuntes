package com.ejemplo03.productos.ejemplo_03_productos_david.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejemplo03.productos.ejemplo_03_productos_david.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor //Aqui le estoy inyectando la dependencia hacia el repo
public class ProductController {

	
	private final ProductoRepository repo;
	
	@GetMapping("/")
	public String list( Model model) {
		
		model.addAttribute("productos",repo.findAll());
		
		return "index";
	}
	
}
