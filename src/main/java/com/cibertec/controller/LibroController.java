package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.model.Libro;
import com.cibertec.repository.ILibroRepository;
@Controller
public class LibroController {
	@Autowired
	private ILibroRepository repoProd;
	
	@GetMapping("/cargar")
	public String regGet(Model model) {
		model.addAttribute("producto", new Libro());
		return "Registro";
	}
	
	@PostMapping("/registrar")
	public String regPost(@ModelAttribute Libro prod) {
		repoProd.save(prod);
		return "Registro";
	}
	
	@GetMapping("/listadoProductos")
	public String listado(Model m) {
		m.addAttribute("lstProds", repoProd.findAll());
		return "Listado";
	}
}
