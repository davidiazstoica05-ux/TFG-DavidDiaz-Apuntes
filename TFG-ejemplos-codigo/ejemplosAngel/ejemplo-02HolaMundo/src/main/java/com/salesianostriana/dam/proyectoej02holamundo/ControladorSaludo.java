package com.salesianostriana.dam.proyectoej02holamundo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Esto sirve para crear los controladores, siempre tiene que ir arriba del todo 
@Controller
public class ControladorSaludo {

	@GetMapping("/saludo3")
	public String welcome3(Model model) {

		model.addAttribute("saludo", "hola mundo!!");
		model.addAttribute("mensaje", "¡Se me está haciendo largo el proyecto final!");
		model.addAttribute("url", "https://triana.salesianos.edu/");

		return "SaludoYEnlace"; // Es el nombre de la pagina web sin el html. Hay que tener cuidado con el
								// nombre de
		// los html.

	}

	@GetMapping("/saludo2")
	public String welcome2(Model model) {

		model.addAttribute("persona", new Persona("Ángel", "Naranjo González", 7.34, LocalDate.of(2005, 7, 28)));

		return "SaludoPersonalizado";

	}

	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre,
			Model model) {

		model.addAttribute("nombre", nombre);

		return "index";

	}
}
