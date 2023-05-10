package com.devsuperior.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.games.dto.JogoDTO;
import com.devsuperior.games.dto.JogoMinDTO;
import com.devsuperior.games.dto.JogoModalDTO;
import com.devsuperior.games.entities.Jogo;
import com.devsuperior.games.projections.JogoMinProjection;
import com.devsuperior.games.repositories.JogoRepository;

//Toda regra de négocio ficará nessa classe, legal né?
@Service
public class JogoService {
	
	//Acesso ao meu banco de dados
	@Autowired
	JogoRepository jogoRepository;
	
	@Transactional(readOnly = true)
	public List<JogoMinDTO> buscarJogos(){
		List<Jogo> retornoDBA = jogoRepository.findAll();
		return retornoDBA.stream().map(jogo -> new JogoMinDTO(jogo)).toList();				
	}
	@Transactional(readOnly = true)
	public JogoDTO buscarJogoId(Long id){
		Jogo retornoDBA = jogoRepository.findById(id).orElse(null);
		return new JogoDTO(retornoDBA);				
	}
	@Transactional(readOnly = true)
	public List<JogoModalDTO> buscarJogosModal(){
		List<Jogo> retornoDBA = jogoRepository.findAll();
		return retornoDBA.stream().map(jogo -> new JogoModalDTO(jogo)).toList();				
	}
	@Transactional(readOnly = true)
	public List<JogoMinDTO> buscarGeneroId(Long id){
		List<JogoMinProjection> retornoDBA = jogoRepository.searchByList(id);
		return retornoDBA.stream().map(jogo -> new JogoMinDTO(jogo)).toList();				
	}
}
