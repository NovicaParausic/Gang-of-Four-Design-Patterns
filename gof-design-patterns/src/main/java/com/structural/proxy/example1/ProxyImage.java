package com.structural.proxy.example1;

public class ProxyImage implements Image {

	private RealImage image = null;
	private String filename = null;
	
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}

}
