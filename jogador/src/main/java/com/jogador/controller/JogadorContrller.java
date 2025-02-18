package com.jogador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogador.entities.Jogador;
import com.jogador.services.JogadorServices;

@RestController 
@RequestMapping("/player")
public class JogadorContrller {
	private final JogadorServices jogadorServices;
	
	@Autowired
	public JogadorContrller(JogadorServices jogadorServices) {
		this.jogadorServices = jogadorServices;
	}
	
	@PostMapping
	public Jogador createJogador(@RequestBody Jogador jogador) {
		return jogadorServices.saveJogador(jogador);
	}
	
	@GetMapping("/{id}")
	public Jogador getJogador(@PathVariable Long id) {
		return jogadorServices.getJogadorById(id);
	}
	
	@GetMapping
	public List<Jogador> getAllJogadores() {
		return jogadorServices.getAllJogadores();
	}
	
	@DeleteMapping("/{id}")
	public void deleteJogador(@PathVariable Long id) {
		jogadorServices.deleteJogador(id);
	}
}
