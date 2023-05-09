package com.devsuperior.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.games.dto.JogoMinDTO;
import com.devsuperior.games.services.JogoService;

//Meus Endipoints, preparados para serem chamados, legal né?
@RestController
@RequestMapping(value = "/jogos")
public class JogoController {
	
	@Autowired
	JogoService service;
	
	@GetMapping
	public List<JogoMinDTO> buscarJogos(){
		List<JogoMinDTO> retornoService = service.buscarJogos();
		return retornoService;
	}
	
}
