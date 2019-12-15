package com.structural.proxy.example1;

public class RealImage implements Image {

	private String filename = null;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisc();
	}

	private void loadImageFromDisc() {
		System.out.println("Loading " + filename);
	}
	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
	
	
}
