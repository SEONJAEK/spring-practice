package com.poscoict.container.videosystem;

import com.poscoict.container.videosystem.DigitalVideoDisc;

public class Avengers implements DigitalVideoDisc {

	private String studio ="MARVEL";
	private String title ="Avengers";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " +studio+"'s "+ title);
		
	}

}
