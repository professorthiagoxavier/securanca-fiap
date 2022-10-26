package com.seguranca.seguranca.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class ExemploController {
	
	
	@GetMapping("/aberto")
	@PreAuthorize("hasRole('admin')")
	public String getOpen() {
		return "Somente admin"; 
	}
	
	@GetMapping("/pessoas")
	@PreAuthorize("hasRole('pessoas')")
	public String getPessoas() {
		return "Endpoint permitido para usuário com o papel (role) de pessoas. "; 
	}
	
	
}
