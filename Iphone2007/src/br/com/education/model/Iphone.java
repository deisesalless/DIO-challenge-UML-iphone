package br.com.education.model;

public class Iphone {
	private Audio audio;
	private Browser browser;
	private Contact contact;

	
	public Iphone() {
		this.audio = new Audio();
		this.browser = new Browser();
		this.contact = new Contact();
	}

	public Audio getAudio() {
		return audio;
	}

	public Browser getBrowser() {
		return browser;
	}

	public Contact getContact() {
		return contact;
	}

	
}
