package com.devsuperior.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.games.dto.ListaJogosDTO;
import com.devsuperior.games.services.ListaJogosService;

//Meus Endipoints, preparados para serem chamados, legal né?
@RestController
@RequestMapping(value = "/")
public class ListaJogosController {
	
	@Autowired
	ListaJogosService service;
	
	@GetMapping("buscarTipo")	
	public List<ListaJogosDTO> buscarTipo(){
		List<ListaJogosDTO> retornoService = service.buscarTipo();
		return retornoService;
	}
	
}
