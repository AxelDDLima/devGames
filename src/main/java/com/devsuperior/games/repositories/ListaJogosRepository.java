package com.devsuperior.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.games.entities.ListaJogos;

public interface ListaJogosRepository extends JpaRepository<ListaJogos, Long> {
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_posicao_jogo SET posicao = :posicaoDestino WHERE lista_jogos_id = :idLista AND jogo_id = :idJogo")
	void atualizarPosicaoElementos(Long idLista, Long idJogo, int posicaoDestino);
}
