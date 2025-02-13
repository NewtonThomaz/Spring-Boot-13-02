package com.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carros.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{

}
