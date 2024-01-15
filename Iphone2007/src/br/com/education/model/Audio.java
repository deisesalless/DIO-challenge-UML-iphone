package br.com.education.model;

import br.com.education.abstraction.Reprodutor;

public class Audio implements Reprodutor {
	
	private int id = 0;
	private int volume = 0;

	@Override
	public void play() {
		System.out.println("A música está tocando");
		
	}

	@Override
	public void pause() {
		System.out.println("A música foi pausada");
		
	}

	@Override
	public void select() {
		System.out.println("A música foi selecionada");
		
	}

	@Override
	public void next() {
		id++;
		System.out.println("A posição da música que está sendo tocada é: " + id);
		
	}

	@Override
	public void turnUpVolume() {
		volume++;
		System.out.println("O volume da música que está sendo tocada é: " + volume);
		
	}

	@Override
	public void turnDownVolume() {
		volume--;
		System.out.println("O volume da música que está sendo tocada é: " + volume);
		
	}

}
