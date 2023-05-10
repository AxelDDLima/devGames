package com.devsuperior.games.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.games.entities.Jogo;

public class JogoDTO {
	private Long id;
	private String titulo;
	private Integer anoLancamento;
	private String genero;
	private String plataforma;
	private Double score;
	private String imgUrl;
	private String descricaoCurta;
	private String descricaoLonga;

	public JogoDTO() {
	}
	public JogoDTO(Jogo jogo) {
		BeanUtils.copyProperties(jogo, this);
	}
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public String getGenero() {
		return genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public Double getScore() {
		return score;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}
	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	public String getDescricaoLonga() {
		return descricaoLonga;
	}
	
	
	
}
