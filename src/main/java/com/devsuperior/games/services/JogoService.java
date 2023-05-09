package com.devsuperior.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.games.dto.JogoMinDTO;
import com.devsuperior.games.entities.Jogo;
import com.devsuperior.games.repositories.JogoRepository;

//Toda regra de négocio ficará nessa classe, legal né?
@Service
public class JogoService {
	
	//Acesso ao meu banco de dados
	@Autowired
	JogoRepository jogoRepository;
	
	public List<JogoMinDTO> buscarJogos(){
		List<Jogo> retornoDBA = jogoRepository.findAll();
		return retornoDBA.stream().map(jogo -> new JogoMinDTO(jogo)).toList();				
	}
}
