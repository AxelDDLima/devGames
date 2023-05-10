package com.devsuperior.games.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PosicaoJogoPK {
	
	@ManyToOne
	@JoinColumn(name = "jogo_id")
	private Jogo jogo;
	@ManyToOne
	@JoinColumn(name = "listaJogos_id")
	private ListaJogos jogoLista;
	
	public PosicaoJogoPK(){
	}
	
	public PosicaoJogoPK(Jogo jogo, ListaJogos jogoLista) {
		this.jogo = jogo;
		this.jogoLista = jogoLista;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public ListaJogos getJogoLista() {
		return jogoLista;
	}

	public void setJogoLista(ListaJogos jogoLista) {
		this.jogoLista = jogoLista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jogo, jogoLista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PosicaoJogoPK other = (PosicaoJogoPK) obj;
		return Objects.equals(jogo, other.jogo) && Objects.equals(jogoLista, other.jogoLista);
	}
}
