package com.devsuperior.games.dto;

import com.devsuperior.games.entities.ListaJogos;

public class ListaJogosDTO {

	private Long id;
	private String nome;
	
	public ListaJogosDTO() {
	}	
	public ListaJogosDTO(ListaJogos obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
}
