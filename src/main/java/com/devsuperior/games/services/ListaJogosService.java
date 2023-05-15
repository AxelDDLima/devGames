package com.devsuperior.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.games.dto.ListaJogosDTO;
import com.devsuperior.games.entities.ListaJogos;
import com.devsuperior.games.projections.JogoMinProjection;
import com.devsuperior.games.repositories.JogoRepository;
import com.devsuperior.games.repositories.ListaJogosRepository;

//Toda regra de négocio ficará nessa classe, legal né?
@Service
public class ListaJogosService {
	
	//Acesso ao meu banco de dados
	@Autowired
	ListaJogosRepository listaJogosRepository;
	
	@Autowired
	JogoRepository jogoRepository;
	
	@Transactional(readOnly = true)
	public List<ListaJogosDTO> buscarTipo(){
		List<ListaJogos> retornoDBA = listaJogosRepository.findAll();
		return retornoDBA.stream().map(jogo -> new ListaJogosDTO(jogo)).toList();				
	}
	
	@Transactional(readOnly = true)
	public void moverPosicao(Long idLista, int posicaoAtual, int posicaoDestino){
		List<JogoMinProjection> retornoDBA = jogoRepository.searchByList(idLista);
		
		JogoMinProjection obj = retornoDBA.remove(posicaoAtual);
		retornoDBA.add(posicaoDestino, obj);
		
		int min = posicaoAtual < posicaoDestino ? posicaoAtual : posicaoDestino;
	    int max	= posicaoAtual < posicaoDestino ? posicaoDestino : posicaoAtual;
	    
	    for(int i = min; i<= max; i++) {
	    	listaJogosRepository.atualizarPosicaoElementos(idLista, retornoDBA.get(i).getId(), i);
	    }
	}
}
