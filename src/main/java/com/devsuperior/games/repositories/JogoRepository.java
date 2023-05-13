package com.devsuperior.games.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.games.entities.Jogo;
import com.devsuperior.games.projections.JogoMinProjection;

//Classe de acesso a Dados, sem precisar montar consulta no banco de dados! legal né?
public interface JogoRepository extends JpaRepository<Jogo, Long> {		
	@Query(nativeQuery = true, value = """
			SELECT jogo.id, jogo.titulo, jogo.GENERO AS GENERO, jogo.img_url AS imgUrl,
            jogo.DESCRICAO_CURTA AS descricaoCurta, JOGO.SCORE AS SCORE, posicao.posicao
            FROM tb_jogo  jogo
			INNER JOIN tb_posicao_jogo posicao ON jogo.id = posicao.jogo_id
			WHERE posicao.lista_jogos_id = :listId
            ORDER BY posicao.posicao; 
				""")
	List<JogoMinProjection> searchByList(Long listId);
}
