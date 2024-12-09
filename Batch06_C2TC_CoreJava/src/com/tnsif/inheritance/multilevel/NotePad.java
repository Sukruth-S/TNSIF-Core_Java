package com.tnsif.inheritance.multilevel;

public class NotePad {
	private String content;

	public NotePad(String content) {
		this.content = content;
	}
	public void write(String content) {
		this.content += content; 
	}
	
	public String displayContent() {
		return content;
	}
}
