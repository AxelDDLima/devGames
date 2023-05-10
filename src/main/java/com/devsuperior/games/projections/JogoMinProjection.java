package com.devsuperior.games.projections;

public interface JogoMinProjection {
	Long getId();
	String getTitulo();
	String getGenero();
	Double getScore();
	String getImgUrl();
	String getDescricaoCurta();
	Integer getPosicao();
}