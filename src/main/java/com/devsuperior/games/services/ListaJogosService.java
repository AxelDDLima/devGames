package com.devsuperior.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.games.dto.ListaJogosDTO;
import com.devsuperior.games.entities.ListaJogos;
import com.devsuperior.games.repositories.ListaJogosRepository;

//Toda regra de négocio ficará nessa classe, legal né?
@Service
public class ListaJogosService {
	
	//Acesso ao meu banco de dados
	@Autowired
	ListaJogosRepository listaJogosRepository;
	
	@Transactional(readOnly = true)
	public List<ListaJogosDTO> buscarTipo(){
		List<ListaJogos> retornoDBA = listaJogosRepository.findAll();
		return retornoDBA.stream().map(jogo -> new ListaJogosDTO(jogo)).toList();				
	}
}
