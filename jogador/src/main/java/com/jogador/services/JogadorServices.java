package com.jogador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogador.entities.Jogador;
import com.jogador.repository.JogadorRepository;

@Service
public class JogadorServices {
	private final JogadorRepository jogadorRepository;
	
	@Autowired
	public JogadorServices(JogadorRepository jogadorRepository) {
		this.jogadorRepository = jogadorRepository;
	}
	
	public Jogador saveJogador(Jogador jogador) {
		return jogadorRepository.save(jogador);
	}
	
	public Jogador getJogadorById(Long id) {
		return jogadorRepository.findById(id).orElse(null);
	}
	
	public List<Jogador> getAllJogadores(){
		return jogadorRepository.findAll();
	}
	
	public void deleteJogador (Long id) {
		jogadorRepository.deleteById(id);
	}
}
