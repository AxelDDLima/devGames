package com.devsuperior.games.dto;

import com.devsuperior.games.entities.Jogo;

public class JogoModalDTO {
	private Long id;
	private String titulo;
	private String imgUrl;
	
	public JogoModalDTO(Jogo param) {
		this.id = param.getId();
		this.titulo = param.getTitulo();
		this.imgUrl = param.getImgUrl();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getImgUrl() {
		return imgUrl;
	}
}
