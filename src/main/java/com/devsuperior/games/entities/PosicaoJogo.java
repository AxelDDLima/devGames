package com.devsuperior.games.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_POSICAO_JOGO")
public class PosicaoJogo {
	
	@EmbeddedId
	private PosicaoJogoPK id = new PosicaoJogoPK();
	private Integer posicao;
	
	public PosicaoJogo() {
		super();
	}
	
	public PosicaoJogo(Jogo jogo, ListaJogos listaJogos, Integer posicao) {
		id.setJogo(jogo);
		id.setJogoLista(listaJogos);
		this.posicao = posicao;
	}

	public PosicaoJogoPK getId() {
		return id;
	}

	public void setId(PosicaoJogoPK id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PosicaoJogo other = (PosicaoJogo) obj;
		return Objects.equals(id, other.id);
	}
}
