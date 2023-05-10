package com.devsuperior.games.dto;

import com.devsuperior.games.entities.Jogo;
import com.devsuperior.games.projections.JogoMinProjection;

//Classe que transporta os dados para o front-end
public class JogoMinDTO {
	private Long id;
	private String titulo;
	private String genero;
	private Double score;
	private String imgUrl;
	private String descricaoCurta;

	public JogoMinDTO(Jogo param) {
		id = param.getId();
		titulo = param.getTitulo();
		genero = param.getGenero();
		score = param.getScore();
		imgUrl = param.getImgUrl();
		descricaoCurta = param.getDescricaoCurta();
	}
	
	public JogoMinDTO(JogoMinProjection param) {
		id = param.getId();
		titulo = param.getTitulo();
		genero = param.getGenero();
		score = param.getScore();
		imgUrl = param.getImgUrl();
		descricaoCurta = param.getDescricaoCurta();
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
