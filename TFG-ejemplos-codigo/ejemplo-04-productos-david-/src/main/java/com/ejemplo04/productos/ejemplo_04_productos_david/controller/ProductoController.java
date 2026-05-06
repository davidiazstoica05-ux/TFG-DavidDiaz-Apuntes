package com.ejemplo04.productos.ejemplo_04_productos_david.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejemplo04.productos.ejemplo_04_productos_david.service.ProductoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor 
public class ProductoController {

	private final ProductoService productoService;
	
	
	@GetMapping("/")
	public String list(Model model) {
		
		model.addAttribute("productos", productoService.getLista());
		return "index";
	}
	
	
}
