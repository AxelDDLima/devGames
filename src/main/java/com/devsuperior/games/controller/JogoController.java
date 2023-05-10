package com.devsuperior.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.games.dto.JogoDTO;
import com.devsuperior.games.dto.JogoMinDTO;
import com.devsuperior.games.dto.JogoModalDTO;
import com.devsuperior.games.dto.ListaJogosDTO;
import com.devsuperior.games.services.JogoService;

//Meus Endipoints, preparados para serem chamados, legal né?
@RestController
@RequestMapping(value = "/")
public class JogoController {
	
	@Autowired
	JogoService service;
	
	@GetMapping("jogos")
	public List<JogoMinDTO> buscarJogos(){
		List<JogoMinDTO> retornoService = service.buscarJogos();
		return retornoService;
	}
	
	@GetMapping("modal")	
	public List<JogoModalDTO> buscarJogosModal(){
		List<JogoModalDTO> retornoService = service.buscarJogosModal();
		return retornoService;
	}
	
	@GetMapping("buscarJogoId")	
	public JogoDTO buscarJogoId(@RequestParam Long id){
		JogoDTO retornoService = service.buscarJogoId(id);
		return retornoService;
	}
	
	@GetMapping("buscarGeneroId")	
	public List<JogoMinDTO> buscarGeneroId(@RequestParam Long id){
		List<JogoMinDTO> retornoService = service.buscarGeneroId(id);
		return retornoService;
	}
}
