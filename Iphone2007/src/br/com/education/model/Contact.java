package br.com.education.model;

import br.com.education.abstraction.Telephone;

public class Contact implements Telephone {

	@Override
	public void call(String number) {
		System.out.println("Ligando para " + number);
		
	}

	@Override
	public void answer() {
		System.out.println("Ligação atendida");
		
	}

	@Override
	public void voiceMail(String phrase) {
		System.out.println("Caixa de mensagens, por favor grave sua mensagem.");
		System.out.println("Mensagem: " + phrase + ", gravada com sucesso");
		
	}

	@Override
	public void hangUp() {
		System.out.println("Ligação encerrada");
		
	}

}
