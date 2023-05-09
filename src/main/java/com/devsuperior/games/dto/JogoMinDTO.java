package com.devsuperior.games.dto;

import com.devsuperior.games.entities.Jogo;

//Classe que transporta os dados para o front-end
public class JogoMinDTO {
	private Long id;
	private String titulo;
	private String genero;
	private Double score;
	private String imgUrl;
	private String descricaoCurta;

	public JogoMinDTO(Jogo param) {
		super();
		this.id = param.getId();
		this.titulo = param.getTitulo();
		this.genero = param.getGenero();
		this.score = param.getScore();
		this.imgUrl = param.getImgUrl();
		this.descricaoCurta = param.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public Double getScore() {
		return score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
	
}
