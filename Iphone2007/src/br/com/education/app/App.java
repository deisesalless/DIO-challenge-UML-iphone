package br.com.education.app;

import br.com.education.model.Iphone;

public class App {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.getAudio().play();
		iphone.getAudio().pause();

		iphone.getContact().call("61999999999");
		iphone.getContact().hangUp();
		iphone.getContact().voiceMail("Oi, sou eu, Deise, me retorna");
		iphone.getContact().answer();

		iphone.getBrowser().openBrowser();
		iphone.getBrowser().openNewPage();
		iphone.getBrowser().search("github projeto iphone");
		iphone.getBrowser().closeBrowser();
	}

}
