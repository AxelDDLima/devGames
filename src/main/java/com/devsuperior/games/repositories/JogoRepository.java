package com.devsuperior.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.games.entities.Jogo;

//Classe de acesso a Dados, sem precisar montar consulta no banco de dados! legal né?
public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
