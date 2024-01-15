package br.com.education.model;

import br.com.education.abstraction.Internet;

public class Browser implements Internet{

	@Override
	public void openBrowser() {
		System.out.println("Navegador safari está aberto");
		
	}

	@Override
	public void openNewPage() {
		System.out.println("Nova página do navegador safari foi aberta");
		
	}

	@Override
	public void search(String phrase) {
		System.out.println("Você pesquisou: " + phrase);
		System.out.println("Aqui está o resultado da sua pesquisa");
		read();
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Navegador safari está fechado");
		
	}
	
	private void read() {
		System.out.println("Página do navegador está disponível para visualização");
		
	}

}
