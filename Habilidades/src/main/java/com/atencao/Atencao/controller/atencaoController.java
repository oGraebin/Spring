package com.atencao.Atencao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/atencao")
public class atencaoController {
	@GetMapping
	public String hello() {
		return "Atenção aos detalhes!";
	}
}
