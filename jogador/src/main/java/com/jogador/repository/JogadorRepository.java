package com.jogador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jogador.entities.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long>{

}
